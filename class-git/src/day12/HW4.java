package day12;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a day: ");

        String weekdays = scan.nextLine();

        switch (weekdays) {
            case "monday":
                System.out.println("monday is weekday");
                break;
            case "tuesday":
                System.out.println("tuesday is weekday");
                break;
            case "wednesday":
                System.out.println("wednesday is weekday");
                break;
            case "thursday":
                System.out.println("thursday is weekday");
                break;
            case "friday":
                System.out.println("friday is weekday");

                break;
            default:
                System.out.println("weekend");
                }
        }
    }

