package EASY;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args){
        int[] arr = {9};
        int[] a = new int[5];
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] res = new int[len+1];
        for (int i = len-1; i >= 0; i--) {

            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;


        }
        res[0]=1;
        return res;
    }
}

