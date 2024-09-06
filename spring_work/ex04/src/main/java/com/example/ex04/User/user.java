package com.example.ex04.User;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
@Configuraion -> 객체 담는통 정의
@Bean -> 객체 지명
@Component -> 이것도 객체라고 지명
@ComponentScan -> 패키지 내용 읽어서 객체 주입 요청
@Autowired -> new 예약어 안쓰고 객체 자동 할당
private final -> @RequiredArgsConstructor -> 객체 자동할당

@Entity -> 이게 테이블이라고 지명
@Table -> table 이름 바꾸기 가능
@Id -> 기본키 primary키 지명

 */

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUtoINCREMENT 이거 설정 요청
    private Long idx;

    private String name;
    private int age;

    private String email;
    private String password;

    private LocalDateTime wdate;






    //JPA class -> table CREATE가 됩니다
}
