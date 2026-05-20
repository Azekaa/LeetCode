package EASY;

import java.util.Stack;

public class Symmetric_Tree_101 {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(1, new TreeNode(2,new TreeNode(3,null,null),new TreeNode(4,null,null)),new TreeNode(2,new TreeNode(4,null,null),new TreeNode(3,null,null)));

        Boolean result = isSymmetric(rootA);


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

    public static boolean isSymmetric(TreeNode root) {
//        return isMirror(root.left , root.right);

        Stack<TreeNode> st = new Stack<>();
        st.push(root.left);
        st.push(root.right);
        while (!st.isEmpty()){
            TreeNode b = st.pop();
            TreeNode a = st.pop();

            if(a == null && b == null) continue;
            if (a== null || b == null) return false;
            if(a.val == b.val){
                st.push(a.left);
                st.push(b.right);
                st.push(a.right);
                st.push(b.left);
            }
            else return false;
        }
        return true;
    }
    public static boolean isMirror(TreeNode p , TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return isMirror(p.left,q.right) && isMirror(p.right,q.left) && p.val == q.val;
    }
}
