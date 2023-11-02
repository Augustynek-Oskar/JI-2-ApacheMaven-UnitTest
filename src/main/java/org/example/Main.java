package org.example;
public class Main {
    public static void main(String[] args) {

    boolean isAdult = checkIfUserIsAdult(17);
        System.out.println(isAdult);


    }

    public static boolean checkIfUserIsAdult (int age) {
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

}