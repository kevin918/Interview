import java.util.Arrays;

public class quicksort {
    public static void main(String[] str) {
        int[] input = {4,0,6,5,9};
        quick(input,0,4);
        System.out.println("result:" + Arrays.toString(input));
    }
    static void quick (int[] input, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(input, start , end);
        partition(input, start, pivot);
        partition(input, pivot+1, end);
    }
    static int partition (int[] input, int start, int end) {
        int pivot = input[start];
        while (start < end ) {
            while (input[start] < pivot) {
                start++;
            }
            while (pivot < input[end]) {
                end--;
            }
            swap(input, start, end);
        }
        return end;
    }
    static void swap (int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}
