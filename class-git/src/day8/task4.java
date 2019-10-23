package day8;

public class task4 {
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInrange = min + (int) (Math.random() * (range + 1));

        if (randomInrange < 0) {
            System.out.println("It is negative");
        }
        if (randomInrange == 0) {
            System.out.println("It is zero");
        }
        if (randomInrange > 0){
            System.out.println("it is positive");
        }

    }
}
