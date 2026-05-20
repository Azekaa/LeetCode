package EASY;

public class Search_Insert_Position_35 {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int pos = 0;
        int lenn = nums.length-1;
        for (int i = 0 ; i <= lenn ; i++){
            if(nums[i]==target){
                return i;
            }
        }
        if(nums.length == 0 || nums[0] > target) return 0;

        while (lenn >= 0){
            if (nums[lenn] < target){
                return lenn +1;
            }
            lenn--;
            }
        return -1;
    }
}
