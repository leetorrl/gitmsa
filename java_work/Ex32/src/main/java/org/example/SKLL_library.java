package org.example;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor



public class SKLL_library {
    private int B_id;
    private String B_name;
    private String B_type;
    private String publisher;
    private int B_state;
    private LocalDateTime B_date;


    public SKLL_library(int b_id, String b_name, String b_type, String publisher, int b_state, LocalDateTime b_date) {
        this.B_id = b_id;
        this.B_name = b_name;
        this.B_type = b_type;
        this.publisher = publisher;
        this.B_state = b_state;
        this.B_date = b_date;
    }


}
