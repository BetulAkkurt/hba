package day8;

import javax.swing.*;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // HW:2. write a program that prints number of word representation number
        //     where number is 0 <= N <= 3
        // ex: zero => 0
        //     one => 1

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");

        int number = scan.nextInt();
        if(number == 0 ) {
            System.out.println("The number is: " + " 0 ");
        }

        if(number == 1) {
            System.out.println("The number is: " + " 1 ");

        }

        if(number == 2){
            System.out.println("The number is: " + " 2 ");
        }

        if(number == 3){
            System.out.println("The number is: " + " 3 ");
        }
    }
}
