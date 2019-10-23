package day14;

import java.util.Scanner;
//task 1 write a program that takes "a" and "b" numbers
// from console, and show multiplication up to that "a" number
// ex: a = 3, b = 2
//     2 => 2 * 1
//     4 => 2 * 2
//     6 => 2 * 3
public class task {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number a : ");
        int x = scan.nextInt();

        System.out.println("Provide a number b : ");
        int y = scan.nextInt();
      for( int i = 1; i<= 50; i++ );
        System.out.println("=>" +(x*y) );
    }}

//(System.out.println("Provide a:");
//        int a = scan.nextInt();
//        System.out.println("Provide b:");
//        int b = scan.nextInt();
//
//        for(int i = 1; i <= a; i++){
//            System.out.println(i * b);)