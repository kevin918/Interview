package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renkai
 *         created on 2018/1/24.
 */
public class permutations {
    public static void main(String[] args) {
        int[] input = {2,1,3};
        List<List<Integer>> res = solution(input);
        System.out.println(res);
    }
    public static List<List<Integer>> solution(int[] input) {
        List<List<Integer>> res = new ArrayList<>();
        help(res, new ArrayList<>(), input);
        return res;
    }

    private static void help(List<List<Integer>> res, List<Integer> integers, int[] input) {
        if(integers.size() == input.length) {
            res.add(new ArrayList<>(integers));
        } else {
            for(int i = 0; i<input.length; i++) {
                if(integers.contains(input[i])) {
                    continue;
                }
                integers.add(input[i]);
                help(res, integers, input);
                integers.remove(integers.size()-1);
            }
        }
    }
}
