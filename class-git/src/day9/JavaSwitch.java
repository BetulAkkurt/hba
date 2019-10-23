package day9;

import java.util.Scanner;

public class JavaSwitch {

    // 1. write a program that prints word representation of your number
    //      where number is 0 <= N <= 10
    // ex: 0 => zero
    // ex: 3 => three
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("provide a number:");
        int number = scanner.nextInt();

        // 0 1 2 3 4 5 6 7 8 9 10
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;


        }
}}
