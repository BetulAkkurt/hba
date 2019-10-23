package calismalarim;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin ;
        do {
            System.out.println("WRITE Your PIN: ");
            pin = scan.nextInt();

            if (pin <= 999 || 10_000 <= pin) {
                System.out.println("Wrong combination,please use a 4 digit number");
            }
        }
            while (pin != 9999) ;
            System.out.println("Take you card");

        }
    }