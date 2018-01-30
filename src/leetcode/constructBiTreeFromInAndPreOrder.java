package leetcode;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author renkai
 *         created on 2018/1/30.
 */
public class constructBiTreeFromInAndPreOrder {
    public static void main(String[] args) {
        int[] in = {4,2,5,1,6,7,3,8};
        int[] pre = {1,2,4,5,3,7,6,8};
        TreeNode root = build(in, pre);
        System.out.println("tree : " + root.value);
        System.out.println(root.left.value + "+" + root.right.value);
    }
    static TreeNode build(int[] in, int[] pre) {
        int inStart = 0;
        int preStart = 0;
        int inEnd = in.length - 1;
        int preEnd = pre.length - 1;
        return helper(in,inStart, inEnd,
                pre, preStart, preEnd);
    }
    static TreeNode helper(int[] in, int inStart, int inEnd,
                           int[] pre, int preStart, int preEnd) {
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int va = pre[preStart];
        TreeNode root = new TreeNode(va);
        int i = 0;
        int index = 0;
        for(;i<in.length;i++) {
            if(in[i] == va) {
                index = i;
                break;
            }
        }
        root.left = helper(in, inStart, index -1,
                pre, preStart + 1, preStart + index - inStart);
        root.right = helper(in, index + 1, inEnd,
                pre, preStart + index - inStart +1, preEnd);
        return root;
    }
}
