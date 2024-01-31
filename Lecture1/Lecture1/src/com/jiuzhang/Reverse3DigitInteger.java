package com.jiuzhang;

public class Reverse3DigitInteger {
    public static void main(String[] args) {
        int num = 123;
        int d1 = num % 10;
        int d2 = num / 10 % 10;
        int d3 = num / 100;

        System.out.println(d1 * 100 + d2 * 10 + d3 );
    }
}
