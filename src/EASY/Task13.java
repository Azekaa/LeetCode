package EASY;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.println(addBinar(a,b));
    }
    public static String addBinar(String a, String b) {
        BigInteger intA = new BigInteger(a,2);
        BigInteger intB = new BigInteger(b,2);
        return intA.add(intB).toString(2);

    }
    public static String addBinary(String a, String b) {
        int carry = 0;
        String revA = new StringBuilder(a).reverse().toString();
        String revB = new StringBuilder(b).reverse().toString();
        int lenA = a.length();
        int lenB = b.length();
        int digA = 0;
        int digB = 0;
        int total = 0;
        String res = "";
        char cha = ' ';
        for (int i = 0; i < Math.max(lenA,lenB); i++) {
            if(lenA > i) digA = revA.charAt(i) - '0'; else digA = 0;
            if (lenB > i) digB = revB.charAt(i) - '0'; else digB = 0;
            total = digA  + digB + carry;
            cha = (char) ((total % 2) + '0');
            res = cha + res;
            carry = total / 2;
        }
        if(carry == 1){
            res = '1' + res;
        }
        return res;

    }
}
