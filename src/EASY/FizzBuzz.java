package EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    public static void fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");}
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }
//    public static List<String> fizzBuzz(int n){
//        List<String> res = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//
//             if (i % 3 == 0 && i % 5 == 0) {
//                res.add("FizzBuzz");}
//            else if (i % 3 == 0){
//                res.add("Fizz");
//            } else if (i % 5 == 0) {
//                res.add("Buzz");
//            }
//            else res.add(String.valueOf(i));
//        }
//    return res;
//    }
}
