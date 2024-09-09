package org.example.Customer;

import java.time.LocalDate;

public class Customer {

    private int c_id;
    private String c_name;
    private int c_phone;
    private LocalDate join_date;
    private LocalDate withdraw_date;


    @Override
    public String toString() {
//        String temp = mydate==null? "" : DateTimeFormatter.ofPattern("yyyy/mm/dd");
        return "Customer{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_phone='" + c_phone + '\'' +
                ", join_date='" + join_date + '\'' +
                ", withdraw_date" + withdraw_date +
                '}';
    }

    public Customer(int c_id, String c_name, int c_phone, LocalDate join_date, LocalDate withdraw_date) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_phone = c_phone;
        this.join_date = join_date;
        this.withdraw_date = withdraw_date;
    }


}
