package EASY;

import java.util.Arrays;

public class Convert_SA_to_BST_108 {
    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};

        TreeNode result = sortedArrayToBST(nums);


        System.out.println(result);
    }
    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode rootNode = build(nums,0,nums.length-1);
        return rootNode;
    }
    private static TreeNode build(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = (start + end)/2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left =  build(nums,start,mid-1);
        midNode.right = build(nums,mid+1,end);
        return midNode;
    }


}
