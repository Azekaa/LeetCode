package EASY;

public class Length_of_Last_Word_58 {
    public static void main(String[] args){
        String s =  "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int len = s.length()-1;
        while (len>=0){
            if(s.charAt(len) != ' '){
                length++;
            }
            else {
                return length;
            }
            len--;
        }
        return length;
    }
}
