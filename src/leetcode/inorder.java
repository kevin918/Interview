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

    }
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
}
