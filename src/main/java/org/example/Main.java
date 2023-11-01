package org.example;

public class Main {
    public static void main(String[] args) {

        int resultOfAdd = add(10,10);
        System.out.println(resultOfAdd);

        int resultOfSubtract = subtract(10,4);
        System.out.println(resultOfSubtract);

        int resultOfMultiply = multiply(6,4);
        System.out.println(resultOfMultiply);

        float resultOfDivide = divide(10,5);
        System.out.println(resultOfDivide);

    }

    public static int add(int numA, int numB){
        return numA + numB;
    }

    public static int subtract(int numA, int numB){
        return numA - numB;
    }

    public static int multiply (int numA, int numB){
        return numA * numB;
    }

    public static float divide (float numA, float numB){
        return numA / numB;
    }

}