package com.pmh.ex09.FreeBoard;

import com.pmh.ex09.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {
    //유효성 검사

    private Long idx;
    private String title;
    private String content;
    private User user;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int view_count;

}
