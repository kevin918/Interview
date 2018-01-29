package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author renkai
 *         created on 2018/1/29.
 */
public class preorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        List<Integer> res = pre(root);
        System.out.println("preorder：" + res);
    }
    static List<Integer> pre(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode s = stack.pop();
            res.add(s.value);
            if(s.right != null) {
                stack.push(s.right);
            }
            if(s.left!= null) {
                stack.push(s.left);
            }
        }
        return res;
    }
}
