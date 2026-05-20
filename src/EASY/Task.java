package EASY;

public class Task {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(-1, new TreeNode(-4,new TreeNode(2,null,null),new TreeNode(3,new TreeNode(2,null,null),null)),new TreeNode(7,new TreeNode(-5,null,null),new TreeNode(-4,null,null)));

        int result = sumDepthMax(rootA);


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
    public static int sumDepth(TreeNode root){

        if(root == null) return 0;
        int maxLeft = sumDepthMax(root.left);
        int maxRight = sumDepthMax(root.right);
        return Math.max(maxLeft,maxRight) + root.val ;
    }
    public static int sumDepthMax(TreeNode root){
        int answer = 0;
        if(root == null) return 0;
        int maxLeft = Math.max(sumDepthMax(root.left),0);
        int maxRight = Math.max(sumDepthMax(root.right),0);
        answer =  Math.max(answer,maxLeft + maxRight+ root.val);
        return Math.max(maxLeft,maxRight) + root.val ;
    }
}
