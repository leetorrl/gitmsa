package com.pmh.org.freeboard;

import com.pmh.org.file.FileEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
public class FreeBoardResponseDto {

    private Long idx;

    private String title;
    private String content;

//    private User user;
    private Long userIdx;

    private String creAuthor;

    private String modAuthor;

    private String regDate;

    private String modDate;

    private int view_count;

    private List<FileEntity> list = new ArrayList<>();
}
