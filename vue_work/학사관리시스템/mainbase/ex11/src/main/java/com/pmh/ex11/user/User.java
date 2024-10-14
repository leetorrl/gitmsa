package com.pmh.ex11.user;

import com.pmh.ex11.FreeBoard.FreeBoard;
import com.pmh.ex11.constant.UserConstant;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long idx;

    @Column(name = "username",nullable = false,length = 50)
    private String name;

    private int age;

    @Column(length = 100, unique = true)
    @Email
    private String email;

    @Column(length = 100)
    private String password;

    private LocalDateTime wdate;

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<FreeBoard> freeBoardList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private UserConstant userConstant;
    // JPA CLASS -> talbe CREATE가 됩니다.

}