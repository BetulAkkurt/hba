package day2;

public class FirstLesson {

    public static void main(String[] Args) {

    int waterPrice = 10;
    int breadPrice = 20;

    int sum = waterPrice + breadPrice;
    System.out.println("Total sum 1:" + sum);

    waterPrice = 15;
    sum = waterPrice + breadPrice;
    System.out.println("Total sum 2: " + sum);


    boolean bool = true;
    boolean bool2 = false;

    int number = 20;

    boolean isBiggerThan10 = number > 10;
    System.out.println();

   boolean falseBool = false;
   boolean trueBool = true;

   System.out.println("true && true => " + (trueBool && trueBool));

    System.out.println(falseBool && falseBool);

    System.out.println(trueBool && falseBool);

    System.out.println(falseBool && falseBool);



    System.out.println();
    System.out.println(true && true);
    System.out.println(false && true);
    System.out.println(true && false);
    System.out.println(false && false);


    System.out.println("Logical OR Operation");
    System.out.println("true || true => " + (trueBool || trueBool));
    System.out.println("false || true => " + (falseBool || trueBool));
    System.out.println("trueBool || false => " + (trueBool || falseBool));
    System.out.println("false || false => " + (falseBool || falseBool));




    }


}