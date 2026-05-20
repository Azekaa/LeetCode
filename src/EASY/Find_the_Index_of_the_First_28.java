package EASY;

public class Find_the_Index_of_the_First_28 {
    public static void main(String[] args){
        System.out.println(strStr("a","a"));
    }
    public static int strStr(String haystack, String needle) {
        int len_a = needle.length();
        int len_b = haystack.length();
        for (int i = 0; i <= len_b-len_a; i++) {
            if(haystack.substring(i,i+len_a).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
