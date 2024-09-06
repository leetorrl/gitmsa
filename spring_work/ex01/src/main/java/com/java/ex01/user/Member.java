package com.java.ex01.user;

import lombok.*;

@Getter
@Setter
//@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder

public class Member {
private int B_id;
private String B_name;
private String B_type;
private String publisher;

    @Override
    public String toString() {
        return "Member{" +
                "B_id=" + B_id +
                ", B_name='" + B_name + '\'' +
                ", B_type='" + B_type + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
