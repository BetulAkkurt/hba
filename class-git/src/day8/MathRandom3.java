package day8;

public class MathRandom3 {
    public static void main(String[] args) {

        double d1 = Math.random();
        System.out.println(d1);
        System.out.println(d1 * 10);

        int i1 = (int) (d1 * 10);
        System.out.println(i1);


        //0 - 1000
        System.out.println((int) Math.random() * 1000);

        double d2 = Math.random();
        System.out.println(d2);
        System.out.println(d2 * 0);




            System.out.println((int) Math.random() * 10);

        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

            int min = 0;
            int max = 3;
            int range = max - min;

            int randomInRange = min + (int) (Math.random() * (range + 1));
            System.out.println(randomInRange);

            if (randomInRange == 1) {
                System.out.println("one");
            }

            if(randomInRange == 2) {
                System.out.println("Two");


            }


            if(randomInRange == 1){
                System.out.println("one");
            }

            if(randomInRange == 2){
                System.out.println("two");

            }

            if(randomInRange == 0){
                System.out.println("zero");
            }
        }
    }




