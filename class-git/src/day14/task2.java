package day14;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        //write a program which prints even numbers up to 10
        //ex: 0, 2, 4, 6, 8

        // hint:
        // if( x%2 ==0 ) => even
        // else => odd


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }


        System.out.println("==========part2=========");

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide first number : ");

        int x;
        int max = scan.nextInt();

        for (int i = 0; i <= max; i++) ;

        int i = 0;

        if (i % 2 == 0) ;
        System.out.println(i);

       // System.out.println(===============part3============);



    }}