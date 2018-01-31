package leetcode;

import java.util.List;

/**
 * @author renkai
 *         created on 2018/1/31.
 */
public class kthSmallestElementBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        Integer res = bst(root, 3);
        System.out.println(res);
    }
    static Integer bst(TreeNode root, int k) {
        List<Integer> inorder = leetcode.inorder.in(root);
        return inorder.get(k-1);
    }
}
