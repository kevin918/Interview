package leetcode;

/**
 * @author renkai
 *         created on 2018/1/31.
 */
public class sumRootToLeaf {
    static Integer sum(TreeNode root) {
        return helper(root, 0);
    }
    static Integer helper(TreeNode root, Integer sub) {

        if(root.left != null) {
            sub += root.value;
            helper(root.left, sub);
        }
        else if(root.left == null) {

        }
        else if(root.right != null) {

        }
        return null;
    }
}
