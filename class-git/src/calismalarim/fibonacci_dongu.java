package calismalarim;

public class fibonacci_dongu {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c ;
        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i<10; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }


    }
}
