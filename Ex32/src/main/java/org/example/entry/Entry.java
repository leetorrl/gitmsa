package org.example.entry;

import lombok.*;

import java.time.LocalDate;

public class Entry {
    private int e_id;
    private LocalDate insertdate;
    private LocalDate updatedate;
    private LocalDate deletedate;
    private String etc ;
    private int s_id;
    private int b_id;
    private int state;

    public Entry(int e_id, LocalDate insertdate, LocalDate updatedate, LocalDate deletedate, String etc, int s_id, int b_id, int state) {
        this.e_id = e_id;
        this.insertdate = insertdate;
        this.updatedate = updatedate;
        this.deletedate = deletedate;
        this.etc = etc;
        this.s_id = s_id;
        this.b_id = b_id;
        this.state = state;
    }


    @Override
    public String toString() {
//        String temp = mydate==null? "" : DateTimeFormatter.ofPattern("yyyy/mm/dd");
        return "SKLL_library{" +
                "e_id=" + e_id +
                ", insertdate='" +insertdate + '\'' +
                ", updatedate='" + updatedate + '\'' +
                ", deletedate='" + deletedate + '\'' +
                ", etc=" + etc +'\'' +
                ", s_id" + s_id +'\'' +
                ", b_id" + b_id +'\'' +
                ", state" + state +
                '}';
    }
}



