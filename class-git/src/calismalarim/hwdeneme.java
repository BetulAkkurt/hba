package calismalarim;

import java.util.Scanner;

public class hwdeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your grade: ");

        String s1 = scan.nextLine();

        if("zero".equalsIgnoreCase(s1)) {
            System.out.println(0);
        }
        if(s1.equals("one")){
            System.out.println(1);
        }
        if(s1.equals("two")){
            System.out.println(2);
        }
        if(s1.equals("three")){
            System.out.println(3);
        }

    }
}
