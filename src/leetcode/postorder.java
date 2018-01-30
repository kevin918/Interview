package leetcode;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author renkai
 *         created on 2018/1/30.
 */
public class postorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        List<Integer> res = rec(root);
        List<Integer> itr = iter(root);
        System.out.println("postorder：" + res);
        System.out.println("itertive: " + itr);
    }

    /**
     * recursive solution
     * @param root
     * @return
     */
    static List<Integer> rec(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }
    static void helper(List<Integer> res, TreeNode node) {
        if(node.left != null) {
            helper(res, node.left);
        }
        if(node.right != null) {
            helper(res, node.right);
        }
        res.add(node.value);
    }

    /**
     * iterative solution
     * @param root
     * @return
     */
    static List<Integer> iter(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode t = s.peek();
            if(t.left == null && t.right == null) {
                res.add(t.value);
                s.pop();
            } else {
                if(t.right != null) {
                    s.push(t.right);
                    t.right = null;
                }
                if(t.left != null) {
                    s.push(t.left);
                    t.left = null;
                }
            }
        }
        return res;
    }
}
