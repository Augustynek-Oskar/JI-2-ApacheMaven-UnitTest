package org.example;

public class Main {
    public static void main(String[] args) {



    }
    public static void getDayOfTheWeek (int dayNum){

        switch (dayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There is no such day!");
                break;

        }

    }



}