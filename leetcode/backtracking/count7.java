package backtracking;

public class count7 {
    int count (int n) {
        int count = 0;
        while (n>0) {
            count += n & 1;
            n >>= 1;
        }
        return count;

    }
}
