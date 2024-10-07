package com.pmh.org.freeboard;

import com.pmh.org.error.BizException;
import com.pmh.org.error.ErrorCode;
import com.pmh.org.file.FileEntity;
import com.pmh.org.file.FileRepository;
import com.pmh.org.user.User;
import com.pmh.org.user.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

//    private static final Logger log = LoggerFactory.getLogger(FreeBoardController.class);

    private final FreeBoardRepository freeBoardRepository;
    private final FileRepository fileRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Value("${my.value}")
    private String welcome;

    @GetMapping("test")
    public String test() {
        return welcome;
    }

    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findALl(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
            , @RequestParam(name = "size", defaultValue = "5") int size) {
        // select * from freeboard oder by idx desc, name desc,
        Sort sort = Sort.by(Sort.Direction.DESC, "idx");
        Pageable pageable = PageRequest.of(pageNum, size, sort);

        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);
        FreeBoardResponsePageDto freeBoardResponsePageDto = modelMapper.map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardResponseDto> list = freeBoardResponsePageDto
                .getContent()
                .stream()
                .map(freeBoard -> {
                    FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
                    freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
                    freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

                    if(freeBoard.getUser()!=null) {
                        freeBoardResponseDto.setCreAuthor(freeBoard.getUser().getName());
                        freeBoardResponseDto.setModAuthor(freeBoard.getUser().getName());
                        freeBoardResponseDto.setUserIdx(freeBoard.getUser().getIdx());
                    }else{
                        freeBoardResponseDto.setCreAuthor("탈퇴한 회원");
                        freeBoardResponseDto.setModAuthor("탈퇴한 회원");
                    }
                    return freeBoardResponseDto;
                }).toList();

        freeBoardResponsePageDto.setList(list);
        return ResponseEntity.ok(freeBoardResponsePageDto);
    }

    @GetMapping("view/{idx}")
    public ResponseEntity<FreeBoardResponseDto> findOne(@PathVariable(name = "idx") long idx) {
        // 해당되는 행 찾고...
        FreeBoard freeBoard = freeBoardRepository.findById(idx).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));
        // 수정 하고...
        freeBoard.setView_count(freeBoard.getView_count() + 1);
        freeBoardRepository.save(freeBoard);

        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
        freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

        if(freeBoard.getUser()!=null) {
            freeBoardResponseDto.setCreAuthor(freeBoard.getUser().getName());
            freeBoardResponseDto.setModAuthor(freeBoard.getUser().getName());
            freeBoardResponseDto.setUserIdx(freeBoard.getUser().getIdx());
        }else{
            freeBoardResponseDto.setCreAuthor("탈퇴한 회원");
            freeBoardResponseDto.setModAuthor("탈퇴한 회원");
        }
        return ResponseEntity.ok(freeBoardResponseDto);
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
//    @Transactional
    public ResponseEntity<FreeBoard> save(
            @Valid @RequestPart(name = "data") FreeBoardReqDto freeBoardReqDto,
            @RequestPart(name = "file", required = false) MultipartFile file) {

//        System.out.println(freeBoardReqDto);

        FreeBoard freeBoard = modelMapper.map(freeBoardReqDto, FreeBoard.class);

        //idx값이 null값이면 오토인크리먼트 적용되면서 자동 글 작성
        if(freeBoardReqDto.getIdx()==null) {
            freeBoardRepository.save(freeBoard);
        }
        else{
            //select from free_board where = idx 1
            FreeBoard dbFreeBoard = freeBoardRepository.findById(freeBoard.getIdx()).orElseThrow();
            dbFreeBoard = modelMapper.map(freeBoardReqDto, FreeBoard.class);
            freeBoardRepository.save(dbFreeBoard);
        }



//        freeBoardRepository.save(freeBoard);
        // Todo...
        // 1번 사용자가 무조건 작성 한걸로..
        // jwt 로그인 하면 ... 로그인한 사용자를 넣음 freeboard entt와 user entt연결
        User user = userRepository.findById(1l).orElse(new User());
        freeBoard.setUser(user);

        if (file != null) {
            String myFilePath = Paths.get("images/file/").toAbsolutePath() + File.separator + file.getOriginalFilename();
            try {
                File destFile = new File(myFilePath);

                //프론트에서 업로드한 파일을 destFile경로가 지정되 있는곳으로 transfer
                file.transferTo(destFile);
            } catch (Exception e) {
                e.printStackTrace();
            }

            FileEntity fileEntity = new FileEntity();
            fileEntity.setName(file.getOriginalFilename());
            fileEntity.setPath(Paths.get("images/file/").toAbsolutePath().toString());
            fileEntity.setFreeBoard(freeBoard);
            fileRepository.save(fileEntity);

            freeBoard.setList(Arrays.asList(fileEntity));

            freeBoardRepository.save(freeBoard);
        } else {
            List<FileEntity> list = fileRepository.findByFreeBoardIdx(freeBoard.getIdx());
            list.forEach(fileEntity -> {
                // delete * from free_board_file where idx = ?
                fileRepository.deleteById(fileEntity.getIdx());
                fileRepository.flush();
            });

            freeBoard.setList(Arrays.asList());
            freeBoardRepository.save(freeBoard);
        }
        return ResponseEntity.status(200).body(freeBoard);

    }
//        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
//
//        freeBoardRepository.save(freeBoard);
//
//
//        User user = userRepository.findById(1l).orElse(new User()); //무ㅠ조건 1번 유저가 저장하는걸로
//        freeBoard.setUser(user);
//
//        freeBoardRepository.save(freeBoard);   //글수정 로직
//
//        if (file != null) { //파일저장
//            String myFilePath = Paths.get("images/file/").toAbsolutePath() +  File.separator + file.getOriginalFilename();
//
//            try {
//                File destFile = new File(myFilePath);
//                file.transferTo(destFile);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//    FileEntity fileEntity = new FileEntity();             //파일 엔티티 만드는 구간...파일 행 저장
//    fileEntity.setName(file.getOriginalFilename());
//
//    fileEntity.setPath(Paths.get("images/file/").toAbsolutePath().toString());
//    fileEntity.setFreeBoard(freeBoard);
//    fileRepository.save(fileEntity);
//}
//        else{
////            System.out.println("오는가?");
////            freeBoard.setList(null);
////            freeBoardRepository.save(freeBoard);
////            fileRepository.findById()
//            List<FileEntity> list = fileRepository.findByFreeBoardIdx(freeBoard.getIdx());
//
//            System.out.println(list);
//
//            list.forEach(fileEntity -> {
//                System.out.println("딜리트 실행전");
//                fileRepository.deleteById(fileEntity.getIdx());
//                fileRepository.flush();
//                System.out.println("딜리트 실행후");
//            });
//        }
//
//        return ResponseEntity.status(200).body(freeBoard);
//    }


        @DeleteMapping("delete/{idx}")
        public ResponseEntity<String> deleteById ( @PathVariable(name = "idx") long idx){

            FreeBoard freeBoard = freeBoardRepository.findById(idx)
                    .orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

//            freeBoard.setList(new ArrayList<>());
            //부모객체를 끊고 고아객체로 만듬

            freeBoard.setUser(null);
            freeBoardRepository.save(freeBoard);
            freeBoardRepository.delete(freeBoard);

//            fileRepository.findByFreeBoardIdx(freeBoard.getIdx()).forEach(fileEntity -> {
//                fileRepository.deleteById(fileEntity.getIdx());
//            });
//
//            freeBoardRepository.cusDeleteByIdx(idx);

            return ResponseEntity.ok("삭제되었습니다.");



//
//            freeBoardRepository.findById(idx).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));
//            freeBoardRepository.deleteById(idx);
//            return ResponseEntity.ok("삭제되었습니다.");
        }


    }
