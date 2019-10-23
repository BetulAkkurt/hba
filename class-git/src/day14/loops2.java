package day14;

public class loops2 {
    public static void main(String[] args) {

            // x = x + y; => x += y;

            for(String s = ""; s.length() <= 3; s += "a"){
                // "" => 0
                // ""+"a"=> "a" => 1
                // "a" + "a" => "aa" => 2
                // "aa" + "a" => "aaa" => 3
                System.out.println(s);
            }
        }
    }

