package day14;
// Part1, write a program which asks you to provide a text
// and it should stop when you type "quit"

// Part2, continue part1 but also check for length() of string
// if length is bigger than 10, program should say that string is too large
// ex:
// in the while loop....
//     wjherjwhejrhwejrh => "string is too large"
// part3 continue part2,if provided string is equals to your name
// program should print your surname

import java.util.Scanner;

public class whileTask {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Write a string");
        String s = line.nextLine();


        while (!s.equals("quit")) {
            System.out.println("Write a string");
            s = line.nextLine();

    while(s.length() > 10){
        System.out.println("String is too large");
        s = line.nextLine();
    }
            while(s.equals("HB")) {
                System.out.println("Akkurt");

            }
        }

    }
}
//(   // Part1, write a program which asks you to provide a text
//    // and it should stop when you type "quit"
//
//    // Part2, continue part1 but also check for length() of string
//    // if length is bigger than 10, program should say that string is too large
//    // ex:
//    // in the while loop....
//    //     wjherjwhejrhwejrh => "string is too large"
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Write a string");
//        String line = scan.nextLine();
//
//        //part1
//        while (!line.equals("quit")) { //s != "exit"
//            System.out.println("Write a string");
//            line = scan.nextLine();
//
//            //part2
//            if(line.length() >= 10){
//                System.out.println("string is too large");
//            } if(line.equals("Max")){
//                System.out.println("Adams");)