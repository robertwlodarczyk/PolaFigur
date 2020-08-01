package pl.wlodarczyk.robert;

import java.time.LocalDate;

public interface DayTable {

    default void printDate () {

        System.out.println(LocalDate.now());
    }


}
