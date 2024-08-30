package org.example;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex05 {

    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted();
//                .filter(s->s.contains("Asia"))
//                .forEach(System.out::println);

        ZonedDateTime korea = ZonedDateTime.now();
        System.out.println(korea);
        
        ZonedDateTime Paris = ZonedDateTime.of(
                korea.toLocalDateTime(),
                ZoneId.of("Europe/Paris")
        );

        System.out.println(Paris);

        Duration 시차 = Duration.between(korea, Paris);
        System.out.println(시차);
    }
}
