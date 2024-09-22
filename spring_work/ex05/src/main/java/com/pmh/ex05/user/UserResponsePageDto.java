package com.pmh.ex05.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponsePageDto {

    //    @Schema(hidden = true)//swagger 문서에서 안보여지게..
    @JsonIgnore //포스트맨에서 안보이게..
    private List<User> f_body;

    private List<UserResponseDto> list;
    private  int totalElements;
    private  int totalpages;
    private  int size;
    }

