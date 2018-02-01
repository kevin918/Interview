package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renkai
 *         created on 2018/1/31.
 */
public class sumRootToLeaf {
    static Integer sum(TreeNode root) {
        int result = 0;
        if(root == null) {
            return result;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(root, sub, res);
        for(List<Integer> r : res) {
            StringBuilder sb = new StringBuilder();
            for(Integer n : r) {
                sb.append(String.valueOf(n));
            }
            int cur = Integer.valueOf(sb.toString());
            result = result + cur;
        }
        return result;
    }
    static void helper(TreeNode root, List<Integer> sub, List<List<Integer>> res) {
        if(root.left == null && root.right == null) {
            List<Integer> t = new ArrayList<>();
            t.addAll(sub);
            res.add(t);
        }
        if(root.left != null) {
            sub.add(root.left.value);
            helper(root.left, sub, res);
            sub.remove(sub.size()-1);
        }
        if(root.right != null) {
            sub.add(root.right.value);
            helper(root.right, sub, res);
            sub.remove(sub.size()-1);
        }
    }
}
