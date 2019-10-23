package day8;

import javax.swing.*;
import java.util.Scanner;

public class xUserInput3 {
    public static void main(String[] args) {

//TODO Task 2:
// Write a program that ask two number,
// in your console it should print same as below:
// Provide a first number:
// 3
// Your first number is 3
// Provide a second number:
// 5
// Your second number is 5
// Task 3.
// continue task 2, print sum of two numbers
// final line of you console should be like this:
// Sum is 8

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a first number: ");
        int first = scan.nextInt();
        System.out.println("Your first number is: " + first + " dir ");

        System.out.println("Provide a seconde number: ");
        int second = scan.nextInt();
        System.out.println("Your second number is: " + second + " dir " );

        int sum = first + second;
        System.out.println("Sum is: " + sum + " dir ");
    }
}
