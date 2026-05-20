package EASY;

public class Task15 {
    public static void main(String[] args){
        int n = 7;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int temp = 0;
        int one = 1;
        int two = 1;
        int three = 0;
        for (int i = 0; i < n-1; i++) {
            temp = one;
            one = one + two + three;
            three = two;
            two = temp;
        }
        return one;
//        if (n == 1 || n == 0 ) return 1 ;
//        if (n == 2) return 2;
//
//        return climbStairs((n-1)) + climbStairs(n-2) ;
    }
}

