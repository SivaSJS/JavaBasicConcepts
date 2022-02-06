package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // even or odd

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("Given input is Even Number");
        }else {
            System.out.println("Given input is Odd Number");
        }

    }
}
