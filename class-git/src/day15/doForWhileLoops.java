package day15;

import java.util.Scanner;

public class doForWhileLoops {
    public static void main(String[] args) {


// == sign -> equal
// != sign -> not equal


            Scanner scan = new Scanner(System.in);

            int pin = 0;
            do {
                System.out.println("Write your PIN: ");
                pin = scan.nextInt();


            } while (pin != 9999);
            System.out.println("Take you card");
        }
    }

