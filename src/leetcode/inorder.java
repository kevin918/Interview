package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author renkai
 *         created on 2018/1/29.
 */
public class inorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        List<Integer> res = in(root);
        List<Integer> rec = recursive(root);
        System.out.println("iterative: " + res + ", recursive: " + rec);
    }

    /**
     * iterative solution
     * @param root
     * @return
     */
    static List<Integer> in(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while (!s.isEmpty() || p != null) {
            if(p != null) {
                s.push(p);
                p = p.left;
            } else {
                TreeNode t = s.pop();
                res.add(t.value);
                p = t.right;
            }
        }
        return res;
    }


    /**
     * recursive solution
     * @param root
     * @return
     */
    static List<Integer> recursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }
    static void helper(List<Integer> res, TreeNode node){
        if(node.left != null) {
            helper(res, node.left);
        }
        res.add(node.value);
        if(node.right != null) {
            helper(res, node.right);
        }
    }
}
