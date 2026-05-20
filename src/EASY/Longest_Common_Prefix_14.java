package EASY;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args){
        String[] strs = {"flower","fligkt"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (String word : strs){
                if (i>= word.length() || word.charAt(i) != strs[0].charAt(i)){
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}
// flowers
// flow
// flight