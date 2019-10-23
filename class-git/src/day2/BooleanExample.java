package day2;

public class BooleanExample {

    public static void main(String[] args) {

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

