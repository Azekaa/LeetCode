package EASY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Two_Sum_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter len of list ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            int num = scanner.nextInt();
            nums[i] = num;
        }
        System.out.print("Enter target ");
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int asd = target - nums[i];
            if (map.containsKey(asd)){
                return new int[] {map.get(asd),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
