package org.example.orders;


import lombok.*;

import java.time.LocalDate;

public class Orders {

    private int o_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private int c_id;
    private LocalDate extension_date;
    private int e_id;

    @Override
    public String toString() {
        return "Orders{" +
                "o_id=" + o_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", c_id=" + c_id +
                ", extension_date=" + extension_date +
                ", e_id=" + e_id +
                '}';
    }

    public Orders(int o_id, LocalDate start_date, LocalDate end_date, int c_id, LocalDate extension_date, int e_id) {
        this.o_id = o_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.c_id = c_id;
        this.extension_date = extension_date;
        this.e_id = e_id;
    }
}

