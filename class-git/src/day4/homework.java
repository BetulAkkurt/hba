package day4;

public class homework {

    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        additionMethod(x, y);
        detuctionMethod(x, y);
        multiplyMethod(x, y);
        divideMethod(x, y);
    }
    public static void divideMethod(int x, int y) {

        System.out.println(x / y);
    }
    public static void additionMethod(int x, int y) {

        System.out.println(x + y);
    }

        public static void detuctionMethod(int x, int y) {
        System.out.println(x - y);

    }

    public static void multiplyMethod(int x , int y) {

        System.out.println(x * y);
    }
    }

