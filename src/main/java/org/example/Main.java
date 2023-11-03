package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkIfNumberIsEven(2));

        System.out.println(checkIfNumberIsEven(3));


    }
    public static boolean checkIfNumberIsEven (int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }

    }


}
