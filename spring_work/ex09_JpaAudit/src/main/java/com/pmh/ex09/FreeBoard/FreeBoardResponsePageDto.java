package com.pmh.ex09.FreeBoard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FreeBoardResponsePageDto {

    private List<FreeBoard> conenet;
    private  int totalElements;
    private  int totalpages;
    private  int size;

}
