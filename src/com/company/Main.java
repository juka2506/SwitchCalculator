package com.company;

public class Main {

    public static void main(String[] args) {
        double six = 1;
        six = six + minOrMax(5, 6, "min");
        System.out.println(six);


    }

    public static double minOrMax(double firstNumber, double secondNumber, String operator) {
        double answer = 0;
        switch (operator) {
            case "min":
                answer = Math.min(firstNumber, secondNumber);
                break;
            case "max":
                answer = Math.max(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Enter a valid operator");
                break;
        }
        return answer;
    }
}
