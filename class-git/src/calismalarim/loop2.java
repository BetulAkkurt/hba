package calismalarim;

public class loop2 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i = i + 1) {   //i+=2
            System.out.println("" + i);
        }
        System.out.println("================================");
        for (int i = 0; i < 10; i++) {
            System.out.println("" + (2 * i + 1));
        }
        System.out.println("============100TO1====================");
        //100 den 1e kadar olan tek sayilar
        // if(i%7 == 0 && i%3 == 0)

        //2 4 8 16 32 2nin usleri
        //1den 5e kadar 5e tam bolunebilen sayilar
    for(int i = 99;i>=1;i-=2){

        System.out.println("" + i );
    }

        System.out.println("============100To1TEksayilar==================");

        for(int i = 99;i>=1;i-=2) {

            System.out.println("" + (100 - (2 * i + 1)));
        }


        //0 ile 100 arasinda hem 3 e hem de 7 ye bolunebilen sayilar
        System.out.println("==============divide7-3=======================");
        for(int i = 0;i <100;i++){
            if(i%3 == 0 && i%7 == 0){
                //if(i%21 == 0) {
                //for(int i =0; i<4; i++){
            System.out.println("" +i);

    }
            System.out.println("==================2pow================");
            for(int i2 = 1; i<100; i*=2){
                System.out.println(""+1);
    }
            for(int i3 = 0; i3<7; i++ ) {
                System.out.println("" + (int)Math.pow(2,i3)); //2nin i.kuvveti ussu
            }

            System.out.println("==================5==================");

            for(int i4 = 1; i<=5; i++)
                if(i%5 == 0)
                System.out.println(i);
            }
}}