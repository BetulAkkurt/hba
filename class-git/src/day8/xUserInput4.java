package day8;

import java.util.Scanner;

public class xUserInput4 {
    public static void main(String[] args) {

// 1. write a program that prints word representation of your number
//      where number is 0 <= N <= 3
// ex: 0 => zero
// ex: 3 => three

// HW:2. write a program that prints number of word representation number
//     where number is 0 <= N <= 3
// ex: zero => 0
//     one => 1

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");

        int number = scan.nextInt();

        if(number ==0) {
            System.out.println(" Zero ");
        }

        if(number ==1) {
            System.out.println(" One ");
        }

        if(number == 3) {
            System.out.println(" Three");
        }
    }
}
