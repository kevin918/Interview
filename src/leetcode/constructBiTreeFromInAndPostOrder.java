package leetcode;

/**
 * @author renkai
 *         created on 2018/1/30.
 */
public class constructBiTreeFromInAndPostOrder {
    public static void main(String[] args) {
        int[] in = {4,2,5,1,6,7,3,8};
        int[] post = {4,5,2,6,7,8,3,1};
        TreeNode root = build(in, post);
        System.out.println(root.value);
        System.out.println(root.left.value + " + " + root.right.value);
    }
    static TreeNode build(int[] in, int[] post) {
        int inStart = 0;
        int inEnd = in.length-1;
        int postStart = 0;
        int postEnd = post.length-1;
        return helper(in, inStart, inEnd, post, postStart, postEnd);
    }
    static TreeNode helper(int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd) {
        if(inStart > inEnd || postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(post[postEnd]);
        int x = 0;
        for(int i=0; i<= inEnd; i++) {
            if(in[i] == post[postEnd]) {
                x = i;
                break;
            }
        }
        root.left = helper(in, inStart, x-1,
                post, postStart, postStart + x - (inStart + 1));
        root.right = helper(in, x+1, inEnd,
                post, postStart + x + inStart, postEnd - 1);
        return root;
    }
}
