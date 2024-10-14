package com.pmh.ex11.FreeBoard;

import com.pmh.ex11.constant.FreeBoardConstant;
import com.pmh.ex11.constant.FreeBoardStateConstant;
import com.pmh.ex11.user.User;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {
    //유효성 검사

    private Long idx;
//
//    private User user;

    private String state;

//    private FreeBoardConstant freeBoardConstant;

    private String textbody;

//    private FreeBoardStateConstant freeBoardStateConstant;

//    private LocalDateTime wdate;
//    private String f_nickname;
//
//    private String f_body;
//
//    private String f_title;
//
//    private String f_password;
//
//    private LocalDateTime f_timestamp;
//
//    private int f_avail;


//    private Long idx;
//
//    @Schema(example = "제목을 넣어주세요")
//    @Length(min = 2, max = 255)
//    private String title;
//
//    @Schema(example = "내용을 넣어주세요")
//    @NotEmpty
//    private String content;
//
////    private User user;
//
//    @Schema(hidden = true)
//    private String regDate;
//
//    @Schema(hidden = true)
//    private String modDate;
//
//    @Schema(hidden = true)
//    private int view_count;

}
