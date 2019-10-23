package day8;

public class task5 {
    public static void main(String[] args) {
        // Check if random number is odd or even

                int min = 10;
                int max = 20;
                int range = max - min;
                int randomInRange = min + (int) (Math.random() * (range + 1));

                int x = randomInRange;
                System.out.println(x);
                if ((x % 2) == 0) {
                    // even
                    System.out.println("even");
                } else {
                    // odd
                    System.out.println("odd");
                }
            }
    }

