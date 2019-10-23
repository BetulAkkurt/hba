package calismalarim;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++) {
            System.out.println("ilk");
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
            System.out.println("====================break===========");
            for(int i2 = 0; i2 <10; i2++){
                System.out.println("ilk");
                if(i2==5) {
                    break;
                }
                    System.out.println(i2);
        }
        System.out.println("her zaman");
    }
}
