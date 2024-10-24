package com.pmh.ex11.FreeBoard;

import com.pmh.ex11.constant.FreeBoardConstant;
import com.pmh.ex11.constant.FreeBoardStateConstant;
import com.pmh.ex11.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "free_boarddd")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
@Data
public class FreeBoard {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
//    @Column(name = "f_idx")
    private Long idx;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private User user;

    private String state;

//    @Enumerated(EnumType.STRING)
//    private FreeBoardConstant freeBoardConstant;

    private String textbody;

    @Enumerated(EnumType.STRING)
    private FreeBoardStateConstant freeBoardStateConstant;

    @CreatedDate
    private LocalDateTime wdate;

//    private String f_nickname;
//
//    private String f_body;
//
//    private String f_title;
//
//    private String f_password;
//
//    @CreatedDate
//    @Column(updatable = false)  //데이트값이 null이면 안됨
//    private LocalDateTime f_timestamp;
//
//    private int f_avail;



//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //프라이머리키 오토인크리먼트(자동증가) 요청
//    private Long idx;
//
//    private String title;
//    private String content;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private User user;
//
//    @CreatedBy
//    private String creAuthor;
//
//    @LastModifiedBy
//    private String modAuthor;
//
//    @CreatedDate
//    @Column(updatable = false)
//    private LocalDateTime regDate;
//
//    @LastModifiedDate
//    private LocalDateTime modDate;
//
//    @Column(columnDefinition = "int default 0")
//    private int view_count;





}
