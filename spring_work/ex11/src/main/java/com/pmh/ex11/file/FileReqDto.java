package com.pmh.ex11.file;

import com.pmh.ex11.freeboard.FreeBoard;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
class FileReqDto {
    private String name;
    private String path;
    private String desc;

}
