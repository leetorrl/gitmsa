package com.pmh.ex11.FreeBoard;

import com.pmh.ex11.constant.FreeBoardConstant;
import com.pmh.ex11.constant.FreeBoardStateConstant;
import com.pmh.ex11.user.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardResponseDto {


    private Long idx;

//    private User user;

//    private FreeBoardConstant freeBoardConstant;

    private String state;

    private String textbody;

    private FreeBoardStateConstant freeBoardStateConstant;

    private LocalDateTime wdate;
//
//    private String f_nickname;
//
//    private String f_body;
//
//    private String f_title;
//
//    private String f_password;
//
//    private String  f_timestamp;
//
//    private int f_avail;

//    private Long idx;
//
//    private String title;
//    private String content;
//
//    private User user;
//
//    private String creAuthor;
//
//    private String modAuthor;
//
//    private String regDate;
//
//    private String modDate;
//
//    private int view_count;
}
