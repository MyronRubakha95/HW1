package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 6;
        double y = 8;
        double a = 2;
        double w = 3;
        double X = 5;
        double b = 7;
        double e = 2;
        //Завдання 1:  x+y-a/2*(x+w)
        double result1 = x + y - a / 2 * (x + w);
        System.out.println("result1 = " + result1);
        // Завдання 2 : a*(x+x)/y-a*3
        double result2 = a * (x + x) / y - a * 3;
        System.out.println("result2 = " + result2);
        // Завдання 3 : a + b / x - y
        double result3 = a + b / x - y;
        System.out.println("result3 = " + result3);
        // Завдання 4 : X-e/2%e+1
        double result4 = X - e / 2 % e + 1;
        System.out.println("result4 = " + result4);
    }
}