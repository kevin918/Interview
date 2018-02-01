package leetcode;

/**
 * @author renkai
 *         created on 2018/2/1.
 */
public class lowestCommonAncestorBST {
    static TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode t = root;
        if(t.value > p.value && t.value < q.value) {
            return t;
        } else if(t.value > p.value && t.value > q.value) {
            return find(t.left, p, q);
        } else if(t.value < p.value && t.value < q.value) {
            return find(t.right, p, q);
        }
        return root;
    }
}
