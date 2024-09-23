package com.pmh.ex11.FreeBoard;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class FreeBoardReqDto {
    //유효성 검사

    private Long idx;

    @Schema(example = "제목을 넣어주세요")
    @Length(min = 2, max = 255)
    private String title;

    @Schema(example = "내용을 넣어주세요")
    @NotEmpty
    private String content;

//    private User user;

    @Schema(hidden = true)
    private String regDate;

    @Schema(hidden = true)
    private String modDate;

    @Schema(hidden = true)
    private int view_count;

}
