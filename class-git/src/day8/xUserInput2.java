package day8;

import java.util.Scanner;

public class xUserInput2 {
    public static void main(String[] args) {
    //TODO Task 1:
    // Write a program that ask a number,
    // in your console it should print same as below:
    // Provide a number:
    // 3
    // Your number is 3


        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number:");
        int number = scan.nextInt();

        System.out.println("Your number is: " + number+ " dir");


    }
}
