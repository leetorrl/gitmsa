package com.pmh.ex05.user;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserReqDto {

    private Long f_idx; //오토인크리먼트 프라이머리

    private int f_avail; //삭제된 게시글 처리 논리적 삭제

    @NotEmpty
    private String f_nickname; //프론트

    @NotEmpty
    private String f_password; //프론트

//    @Schema(example = "제목을 넣어주세요")
//    @Length(min = 2, max = 255)
    @NotEmpty
    private String f_title; //프론트

//    @Schema(example = "내용을 넣어주세요")
    @NotEmpty
    private String f_body; //프론트

    private LocalDateTime f_timestamp; //로컬데이트 나우
//    private String name;
//    private int age;
//
//    @NotEmpty
//    private String email;
//    @NotEmpty
//    private String password;
//


}
