package org.example;
public class Main {
    public static String getDayOfTheWeek(int dayNum) {

        switch (dayNum) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6, 7:
                return "Weekend";
            default:
                return "There is no such day!";

        }
    }
}


