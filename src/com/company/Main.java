package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        int y = 8;
        int a = 2;
        int w = 3;
        int X = 5;
        int b = 7;
        int e = 2;


        //Завдання 1:  x+y-a/2*(x+w)

        int result1 = x+y-a/2*(x+w);
        System.out.println("result1 = " + result1);

        // Завдання 2 : a*(x+x)/y-a*3

        int result2 = a*(x+x)/y-a*3;
        System.out.println("result2 = " + result2);


        // Завдання 3 : a+b/x-y

        int result3 = a+b/x-y;
        System.out.println("result3 = " + result3);

        // Завдання 4 : X-e/2%e+1
        int result4 = X-e/2%e+1;
        System.out.println("result4 = " + result4);
    }
}
