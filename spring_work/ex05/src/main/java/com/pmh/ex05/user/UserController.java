package com.pmh.ex05.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

//    private final ModelMapper modelMapper;

//    @GetMapping
//    public ResponseEntity<UserResponsePageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum,
//                                                            @RequestParam(name = "size", defaultValue = "5" ) int size){
////        defaultValue = "5"
////        List<FreeBoard> list = freeBoardRepository.findAll();
//
//        Sort sort = Sort.by(Sort.Direction.DESC,"f_idx");
//
////        int pageNum = 0;
////        int size = 10;
//
//        Pageable pageable = PageRequest.of(pageNum,size,sort);
//
//        Page<User> page = UserRepository.findAll(pageable);
//
//        System.out.println("elements = "+page.getTotalElements());
//        System.out.println("pages = "+page.getTotalPages());
//
//        UserResponsePageDto freeBoardResponsePageDto
//                = modelMapper.map(page, UserResponsePageDto.class);
//
//        List<UserResponseDto> list = new ArrayList<>();
//
//        for (User user : freeBoardResponsePageDto.getf_body()){
//            UserResponseDto userResponseDto
//                    = new ModelMapper().map(user, UserResponseDto.class);
//
//            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
//
//            UserResponseDto.f_timestamp(dateTimeFormatter.format(user.f_timestamp()));
//
//
//            list.add(UserResponseDto);
//        }
//        UserResponsePageDto.setList(list);
//
//
//        return ResponseEntity.ok(UserResponsePageDto);
//
//    }





    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReqDto userReqDto){
        System.out.println("실행");
        // save insert 실행...
//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("aaa@naver.com")
//                .password("password")
//                .wdate(LocalDateTime.now())
//                .build(); 모델맵퍼로 해결됨

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        System.out.println("user = "+ user);
        userRepository.save(user);
        return "ok";
    }

    @DeleteMapping("delete/{f_idx}")
    public ResponseEntity<String> deleteByid(@PathVariable(name="f_idx") long f_idx){

//        UserRepository.findById(f_idx).orElseThrow(()-> new BizException(ErrorCode.NOT_FOUND));
//        UserRepository.deleteById(f_idx);


        return ResponseEntity.ok("삭제되었습니다");
    }
}
