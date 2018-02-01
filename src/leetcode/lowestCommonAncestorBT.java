package leetcode;

/**
 * @author renkai
 *         created on 2018/2/1.
 */
public class lowestCommonAncestorBT {
    static TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p || root ==q) {
            return root;
        }
        TreeNode l = find(root.left, p, q);
        TreeNode r = find(root.right, p, q);
        if(l!=null && r !=null){
            return root;
        } else if (l == null && r == null) {
            return null;
        } else {
            return l == null ? r:l;
        }

    }
}
