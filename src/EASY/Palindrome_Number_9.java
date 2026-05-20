package EASY;

import java.util.Scanner;

public class Palindrome_Number_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int orig = num;
        int neorig = 0;
        while (orig !=0){
            neorig = (neorig * 10) + (orig%10);
            orig /=10;
        }
        if(neorig == num){

        }
    }
}

//123
//neorig = ((0*10) + (123%10))  = 0 + 3 = 3
//3*10 + 12%10 = 30+2 = 32
//32*10 + 1%10 = 320+1 = 321
//321
