package day14;

import java.util.Scanner;

public class x1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = "";

        while (!line.equals("quit")) {
            System.out.println("write a string:");
            line = scan.nextLine();


            while (line.length() >= 10) {
                System.out.println("write a string: ");
                line = scan.nextLine();

                System.out.println("string is too large");

            }
            while (line.equals("HB")) {
                System.out.println("write a string: ");
                line = scan.nextLine();
                System.out.println("AKKURT");
            }

        }
    }}

