package EASY;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public static void main(String[] args){
        int[] arr = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[j] != nums[i]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
