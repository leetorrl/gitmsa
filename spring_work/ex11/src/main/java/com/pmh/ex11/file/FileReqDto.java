package com.pmh.ex11.file;

import com.pmh.ex11.FreeBoard.FreeBoard;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
class FileReqDto {
    private String name;
    private String path;

    private String fileDesc;

    @ManyToOne
    private FreeBoard freeBoard;
}
