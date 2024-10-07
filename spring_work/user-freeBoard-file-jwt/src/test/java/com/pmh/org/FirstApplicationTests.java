package com.pmh.org;

import com.pmh.org.file.FileEntity;
import com.pmh.org.freeboard.FreeBoard;
import com.pmh.org.freeboard.FreeBoardRepository;
import com.pmh.org.user.User;
import com.pmh.org.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class FirstApplicationTests {

@Autowired
    UserRepository userRepository;

@Autowired
FreeBoardRepository freeBoardRepository;

    @Test
    void contextLoads(){

        String []str = {"10임","20임","30임"};

        Arrays.stream(str).forEach(System.out::println);

       String result = Arrays.stream(str).reduce("",(s, s2) -> {return s+s2;});
        System.out.println(result);

    }

    @Test
    void updateTest() {
//        User user = User.builder()
//                .idx(1l)
//                .name("홍길동")
//                .age(20)
//                .email("ddd@dame.com")
//                .password("password")
//                .build();
//
//        userRepository.save(user);

        User user = userRepository.findById(1l).orElseThrow(); //입력된 자료를 불러오는 명령어



        FreeBoard freeBoard = FreeBoard.builder()
                .idx(2l)
                .title("제목")
                .content("내용ㅁㄹ")
                .user(user)
                .build();

        freeBoardRepository.save(freeBoard);


    }
        @Test
        void selectTest() {
            List<FreeBoard> list = freeBoardRepository.findAll();
            list.stream().forEach(System.out::println);
        }

        @Test
        void deleteTest(){
            freeBoardRepository.deleteById(5l);
        }


    @Test
    void deleteJOQLTest(){
        freeBoardRepository.deleteById(4l);
    }



        @Test
    void saveFreeBoardTest(){
User user = userRepository.findById(1l).orElseThrow();

List<FileEntity> list = Arrays.asList(
        FileEntity.builder().name("afile").build(),
        FileEntity.builder().name("bfile").build()
);

            FreeBoard freeBoard = FreeBoard.builder()
                    .idx(10l)
                    .title("제목1234")
                    .content("내용ㅁㄹ4444")
                    .list(null)
                    .user(user)
                    .build();

            freeBoardRepository.save(freeBoard);
        }


//	@Autowired
//	public AA aa;
//
//	@Test
//	void contextLoads() {
//		aa.doA();
//	}

}
