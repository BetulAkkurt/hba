package day7;

public class task3 {
    public static void main(String[] args) {

        String a = "LongString";
        String b = "ShorterOne";
        int c = a.length() - b.length();

        if (c < 0) {
            System.out.println(" Cannot proceed");
        } else
            System.out.println("We can do it");


    }
}
