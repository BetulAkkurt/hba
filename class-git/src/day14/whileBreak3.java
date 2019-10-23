package day14;

import java.util.Scanner;

public class whileBreak3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Write a text");
            String line = scan.nextLine();

            //if(line.length("quit"))
            //break;


            if (line.contains("#")) {
                System.out.println("Strong Password");

            }
            if (line.contains("#$")) {
                System.out.println("More Strong Password");
            }



            else {
               System.out.println("WeekPassword");



            }
            String lineUpperCase = line.toUpperCase();
            if (line.equals(line.toLowerCase())) {
                System.out.println("Please Use UpperCase letters: ");

    }

}}}
//( // part1. check for the #, @, $, * symbols also for a strong password
//            // hint: fill if statement with conditions
//            if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("*") ) {
//                System.out.println("Strong Password");
//            } else{
//                System.out.println("Weak Password");
//            }
//            // part2. continue part1, if your text does not contain
//            //        those symbols, it should print "weak password"
//
//            // part3. check text if it's only uppercase print "use lowercase letters"
//            // Hint: line.toUpperCase();
//            //       line.equals();
//            // part4. check text if it's only lowercase print "use uppercase letters")
//APPLE
           // if (line.equals(lineUpperCase)) {
           //         System.out.println("use lowercase letters");
             //       // part4. check text if it's only lowercase print "use uppercase letters"
               //     }else if (line.equals(lineLowerCase)) {
                 //   System.out.println("use uppercase letters");