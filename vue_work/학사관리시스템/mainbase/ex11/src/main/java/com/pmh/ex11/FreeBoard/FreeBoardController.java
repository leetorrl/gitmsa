package com.pmh.ex11.FreeBoard;

import com.pmh.ex11.constant.FreeBoardConstant;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

//    private static final Logger log = LoggerFactory.getLogger(FreeBoardController.class);

    private final FreeBoardRepository freeBoardRepository;
//    private final ModelMapper modelMapper;

//
//    @GetMapping
//    public ResponseEntity<FreeBoardResponsePageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum,
//                                                            @RequestParam(name = "size", defaultValue = "5" ) int size){
////        defaultValue = "5"
////        List<FreeBoard> list = freeBoardRepository.findAll();
//
//        Sort sort = Sort.by(Sort.Direction.DESC,"id");
//
////        int pageNum = 0;
////        int size = 10;
//
//        Pageable pageable = PageRequest.of(pageNum,size,sort);
//
//        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);
//
//        System.out.println("elements = "+page.getTotalElements());
//        System.out.println("pages = "+page.getTotalPages());
//
//        FreeBoardResponsePageDto freeBoardResponsePageDto
//                = modelMapper.map(page, FreeBoardResponsePageDto.class);
//
//        List<FreeBoardResponseDto> list = new ArrayList<>();
//
//        for (FreeBoard freeBoard : freeBoardResponsePageDto.getContent()){
//            FreeBoardResponseDto freeBoardResponseDto
//                    = new ModelMapper().map(freeBoard, FreeBoardResponseDto.class);
//
//            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
//
//            freeBoardResponseDto.setF_timestamp(dateTimeFormatter.format(freeBoard.getF_timestamp()));
//
//            list.add(freeBoardResponseDto);
//        }
//        freeBoardResponsePageDto.setList(list);
//
//
//        return ResponseEntity.ok(freeBoardResponsePageDto);
//
//    }


//    @GetMapping("view/{id}")
//    public ResponseEntity<FreeBoardResponseDto> findOne(@PathVariable(name = "id") long id){
//                                                  //한개 가져올때 findOne
//        FreeBoard freeBoard = freeBoardRepository.findById(id).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));
//
//        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
//
//        freeBoardResponseDto.setF_timestamp(dateTimeFormatter.format(freeBoard.getF_timestamp()));
//
//        return ResponseEntity.ok(freeBoardResponseDto);
//    }

    @PostMapping("insert")
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        System.out.println(freeBoardReqDto);

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        freeBoard.setIdx(freeBoardReqDto.getIdx());

        freeBoard.setWdate(LocalDateTime.now());

        System.out.println(freeBoard.getTextbody());

        System.out.println(freeBoard);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteByid(@PathVariable(name = "id") long id) {

//        freeBoardRepository.findById(id).orElseThrow(()-> new BizException(ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(id);

        return ResponseEntity.ok("삭제되었습니다");
    }


}
