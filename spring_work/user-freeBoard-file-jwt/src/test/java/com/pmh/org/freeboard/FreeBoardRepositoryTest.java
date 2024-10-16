// ackage com.pmh.org.freeboard;

// import com.pmh.org.user.User;
// import com.pmh.org.user.UserRepository;
// import jakarta.transaction.Transactional;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import java.util.List;

// @SpringBootTest
// class FreeBoardRepositoryTest {

//     @Autowired
//     FreeBoardRepository freeBoardRepository;

//     @Autowired
//     UserRepository userRepository;


//     @Test
//     @Transactional //인설트 했는거 자동삭제...안해도됨
//     void insertTest(){

//         User user = User.builder()
//                 .name("괴도길동")
//                 .age(20)
//                 .email("aaad@yahoo.com")
//                 .password("1234")
//                 .build();

// //        userRepository.save(user); FreeBoard에 @ManyToOne의
// //                                   cascade = CascadeType.ALL이라 주석처리하고 밑에
// //                                   .user추가하여 같이 인설트함

//         FreeBoard freeBoard = FreeBoard.builder()
//                 .title("제목")
//                 .content("내용")
//                 .user(user)
//                 .build();

//         freeBoardRepository.save(freeBoard);

//     }

//     @Test
//     void selectTest(){
//         List<FreeBoard> list = freeBoardRepository.findAll();
//         list.stream().forEach(System.out::println);
//     }

//     @Test
//     void deleteTest(){

//         freeBoardRepository.deleteById(3l); //Long 타입..

//     }

//     void updateTest(){
//         User user = User.builder()
//                 .name("괴도길동")
//                 .age(20)
//                 .email("aaad@yahoo.com")
//                 .password("1234")
//                 .build();

//         FreeBoard freeBoard = FreeBoard.builder()
//                 .idx(6l)
//                 .title("제목")
//                 .content("내용")
//                 .user(user)
//                 .build();

//         freeBoardRepository.save(freeBoard);

//     }
// }