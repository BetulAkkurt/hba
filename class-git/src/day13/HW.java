package day13;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scan.nextInt();
        System.out.println("=================1==================");
        for (int i = 1; i <= 100; i++)
            if (i % 5 == 0)
                System.out.println(i);

        System.out.println("=================2==================");


        for (int i2 = 1; i2 <= 100; i2++)
            if (i2 % 3 == 0)
                System.out.println(i2);





    }}
