package leetcode;

/**
 * @author renkai
 *         created on 2018/1/26.
 */
public class nextpermutation {
    public static void solution(int[] nums) {
        int len = nums.length;
        int swapA = nums[0];
        for(int i = 0; i<len-2; i++) {
            if(nums[i+1] < nums[i]) {

            }
        }
    }
    private static void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
