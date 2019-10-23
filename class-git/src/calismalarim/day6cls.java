package calismalarim;

public class day6cls {
    public static void main(String[] args) {
        String a1 = "100";
        String a2 = "300";

        int num1 = Integer.valueOf(a1);
        int num2 = Integer.valueOf(a2);
        System.out.println(num1 + num2);

        System.out.println("------------------------------");

        String v1 = "5";
        int v2 = 50;
        double v3 = 2.24;
        String v4 = "22";
        int v5 = 50000;
        String v6 = "22.234234";

            double average = (Integer.valueOf(v1)) + v2 + 2.24 + (Integer.valueOf(v4) + v5 + (Double.valueOf(v6)));
        System.out.println(average);
    }
}
