package EASY;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task18 {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(1, new TreeNode(2,new TreeNode(3,null,null),null),null);


        List<Integer> result = inorderTraversal(rootA);


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


        public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> st = new Stack();
            TreeNode current = root;
            while (current != null || !st.isEmpty()){
                while (current != null){
                    st.push(current);
                    current = current.left;
                }
                current = st.pop();
                list.add(current.val);
                current = current.right;
            }
            return list;
    }
}
