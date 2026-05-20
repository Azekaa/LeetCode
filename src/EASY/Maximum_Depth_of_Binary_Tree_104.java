package EASY;

import java.util.Stack;

public class Maximum_Depth_of_Binary_Tree_104 {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(1, new TreeNode(2,new TreeNode(3,null,null),new TreeNode(4,null,null)),new TreeNode(2,new TreeNode(4,null,null),new TreeNode(3,null,null)));

        int result = maxDepth(rootA);


        // печатаем результат
        System.out.println(result);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }


}
















