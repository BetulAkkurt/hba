package day15;

//task 1, check your pin,pin shoul be 4 digit number
//if it is not 4 digit number,print "incorrect pin"
//hint: 999<pin<1000

import java.util.Scanner;

public class tas1pin {
    public static void main(String[] args) {
        // task 1, check pin, pin should be 4 digit number
        // if it is not 4 digit number, print "incorrect pin"
        // hint: 999 < PIN < 10000
        // ex: 13123 => "incorrect pin"

            Scanner scan = new Scanner(System.in);

        String pin;
        do {
            System.out.println("please write pin");
            pin = scan.nextLine();

        } while (!pin.equals("9999"));

        System.out.println("take your card");
    }
}

//( int pin;
//        do {
//            System.out.println("please write pin");
//            pin = scan.nextInt();
//
//            if (pin <= 999 || 10000 <= pin) {
//                // 123 => 999
//                // 1233 => 10000
//                /// 9999 + 1 => 10000
//
//                System.out.println("Wrong combination, please use a 4 digit number");
//            }
//        } while (pin != 9999);
//
//        System.out.println("take your card");
//    }
//})