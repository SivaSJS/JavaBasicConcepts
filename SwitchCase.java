package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number from 1 to 5:  ");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Correct Answer");
                break;
            case 3:
                System.out.println("Wrong");
                break;
            case 4:
                System.out.println("Wrong");
                break;
            case 5:
                System.out.println("Wrong");
                break;
            default:
                System.out.println("Enter the correct Input");
        }

    }
}
