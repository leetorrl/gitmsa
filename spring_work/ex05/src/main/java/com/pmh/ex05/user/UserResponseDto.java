package com.pmh.ex05.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponseDto {

    private Long f_idx; //오토인크리먼트 프라이머리

    private int f_avail; //삭제된 게시글 처리 논리적 삭제

    private String f_password; //프론트

    private String f_nickname; //프론트

    private String f_title; //프론트

    private String f_body; //프론트

    private LocalDateTime f_timestamp; //로컬데이트 나우

}
