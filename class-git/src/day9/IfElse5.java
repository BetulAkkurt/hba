package day9;

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number please: ");


        long number = scan.nextLong();

        if( number >= -128 && number <= 127 ){
            System.out.println("The number is: byte " );
        }
        else if(number >= -32768 && number <= 32768 ) {
            System.out.println("The number is: short");
        }
         else if (number >= Integer.MIN_VALUE && number  <= Integer.MAX_VALUE) {
             System.out.println("The number is int");
         }}}



