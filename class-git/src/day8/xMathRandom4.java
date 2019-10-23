package day8;

public class xMathRandom4 {
    public static void main(String[] args) {

        //int randomInRange = min + (int)(Math.random() * ((max-min)+1));
        // Check if random number is positive or negative
        // where number is -200<=N<=200
        // ex: -123 => negative
        // ex: 10 => positive

        int max = 200;
        int min = -200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        System.out.println(randomInRange);
        if (randomInRange < 0) {
            System.out.println("Negative");
        }

        if (randomInRange == 0) {
            System.out.println("Zero");
        }

        if (randomInRange >= 0) {
            System.out.println("Positive");
        }
    }
}