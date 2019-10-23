package day14;

import java.util.Scanner;

//continue tas1
public class task_doWhileLength {
    public static void main(String[] args) {
        // task 1, check pin, pin should be 4 digit number
        // if it is not 4 digit number, print "incorrect pin"
        // hint: .length() -> to check length
        // ex: 13123 => "incorrect pin"

            Scanner scan = new Scanner(System.in);
            String pin;
            do {
                System.out.println("please write pin");
                pin = scan.nextLine();
                //write you code here
                if (pin.length() != 4) {
                    System.out.println("incorrect pin");
                }

            } while (!pin.equals("9999"));
            System.out.println("Take your card, please");
        }
    }


