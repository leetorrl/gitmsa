package com.pmh.org.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.org.freeboard.FreeBoard;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@EntityListeners(AuditingEntityListener.class)
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
    @Schema(hidden = true)
    @JsonIgnore
    private String password;

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime wdate;

    //테이블 create 하면서 role(역활)컬럼 USER,ADMIN 추가...
    private String role;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<FreeBoard> list = new ArrayList<>(); //프리보드와 양방향 맵핑

    // JPA CLASS -> talbe CREATE가 됩니다.

}