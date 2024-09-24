package com.pmh.ex11.FreeBoard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardResponsePageDto {

//    @Schema(hidden = true)//swagger 문서에서 안보여지게..
    @JsonIgnore //포스트맨에서 안보이게..
    private List<FreeBoard> content;

    private List<FreeBoardResponseDto> list;
    private  int totalElements;
    private  int totalpages;
    private  int size;

}
