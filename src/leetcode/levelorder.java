package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author renkai
 *         created on 2018/1/30.
 */
public class levelorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        List<List<Integer>> level = level(root);
        System.out.println("level order：" + level);
    }
    static List<List<Integer>> level(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        LinkedList<TreeNode> linked = new LinkedList<>();
        linked.add(root);
        while(!linked.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = linked.size();
            for(int i=0; i<size; i++) {
                TreeNode t = linked.poll();
                level.add(t.value);
                if(t.left != null) {
                    linked.add(t.left);
                }
                if(t.right != null) {
                    linked.add(t.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
