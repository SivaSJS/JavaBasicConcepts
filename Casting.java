package com.company;

public class Casting {
    public static void main(String[] args) {
//        2 types of casting exists
//   Large to small  1) Narrow casting ==>  double -> float -> long -> int -> char -> short -> byte
//   Small to Large  2) Widening Casting ==>  byte -> short -> char -> int -> long -> float -> double


//        Example for Narrow casting
        // direct castion
        int myInt = 9;
        float isFloat = myInt;
        System.out.println(isFloat);

        //Narrow casting

        int val = 200;
        byte isByte = (byte) val;
        System.out.println(isByte);

        //Widening Casting

        int  isInt = 20;
        double isLong = isInt;
        System.out.println(isLong);

    }
}
