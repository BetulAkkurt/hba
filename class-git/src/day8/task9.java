package day8;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(System.in);
        int number2 = sc.nextInt();

        System.out.println(number);
        if(number < 0) {
            System.out.println("Negative");
        }

        if(number > 0) {
            System.out.println("positive");
        }

        if(number == 0) {
            System.out.println("It is zero");
        }
    }
}
