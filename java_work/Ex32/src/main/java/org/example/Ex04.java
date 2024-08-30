package org.example;

import java.time.*;


public class Ex04 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();


        LocalDateTime f1 = LocalDateTime.of(2025,1,25,11,20);
        LocalDateTime f2 = LocalDateTime.of(2025,1,30,8,20);
// 오늘(2024년 8월 30일) 과 1월 25일 날짜차이
        Period period = Period.between(localDateTime.toLocalDate(),f1.toLocalDate());
        System.out.println(period);
//f1(1월 25일 11시 20분) f2(1월 30일 8시 20분)
        Duration duration = Duration.between(f1.toLocalTime(),f2.toLocalTime());
        System.out.println(duration);
    }
}
