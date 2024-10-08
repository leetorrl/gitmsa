package com.pmh.ex11.FreeBoard;

import com.pmh.ex11.user.User;
import lombok.Data;

@Data
public class FreeBoardResponseDto {

    private Long idx;

    private String title;
    private String content;


    private User user;


    private String creAuthor;


    private String modAuthor;


    private String regDate;


    private String modDate;


    private int view_count;
}
