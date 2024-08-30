package org.example;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor


public class SKLL_library {

    private int B_id;
    private String B_name;
    private String B_type;
    private String publisher;
    private int B_state;
    private LocalDateTime B_date;


}
