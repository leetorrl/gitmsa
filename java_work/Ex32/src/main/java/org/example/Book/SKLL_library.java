package org.example.Book;

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
    private LocalDateTime B_date;

    private int c_id;

    @Override
    public String toString() {
//        String temp = mydate==null? "" : DateTimeFormatter.ofPattern("yyyy/mm/dd");
        return "SKLL_library{" +
                "B_id=" + B_id +
                ", B_name='" + B_name + '\'' +
                ", B_type='" + B_type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", B_date=" + B_date +'\'' +
                ", c_id" + c_id +
                '}';
    }

    public SKLL_library(int b_id, String b_name, String b_type, String publisher, LocalDateTime b_date, int c_id) {
        this.B_id = b_id;
        this.B_name = b_name;
        this.B_type = b_type;
        this.publisher = publisher;
        this.B_date = b_date;
        this.c_id = c_id;
    }


}
