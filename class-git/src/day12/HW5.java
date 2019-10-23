package day12;

import java.util.Scanner;

//write a program that find the size.
// user input integer and output the size of the clothes.
public class HW5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provite your size;");
        int size = scan.nextInt();

        switch (size){
            case 12:
                System.out.println("your size is xl");
                break;
            case 10:
                System.out.println("your size is l");
                break;
            case 8:
                System.out.println("your size is m");
                break;
            case 6:
                System.out.println("s");
                break;
            default:
                System.out.println("invalid");
        }


    }
}
