package org.example.Book;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class myDayFormat {

    public static String myformat(LocalDateTime localDateTime) {
        return DateTimeFormatter
                .ofPattern("MM/dd").format(localDateTime);
    }

}

