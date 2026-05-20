package EASY;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task19 {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(1, new TreeNode(2,new TreeNode(3,null,null),null),null);
        TreeNode rootB = new TreeNode(1, new TreeNode(2,new TreeNode(3,null,null),null),null);


        Boolean result = isSameTree(rootA,rootB);


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

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> st = new Stack<>();
        st.push(p);
        st.push(q);
        while (!st.isEmpty()){
            TreeNode b = st.pop();
            TreeNode a = st.pop();
            if(a == null && b == null) continue;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;
            st.push(a.right);
            st.push(b.right);
            st.push(a.left);
            st.push(b.left);
        }
        return true;

//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.left,q.left) && isSameTree(p.right ,q.right);

    }
}
