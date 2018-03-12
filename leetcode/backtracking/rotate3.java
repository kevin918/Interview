package backtracking;

public class rotate3 {
    static void rotate(int n, int[][] m) {
        for (int x = 0; x < n/2 ; x++) {
            for (int y = x; y<n-x-1; y++) {
                int temp = m[x][y];
                m[x][y] = m[y][n-x-1];
                m[y][n-x-1] = m[n-x-1][n-y-1];
                m[n-x-1][n-y-1] = m[n-y-1][x];
                m[n-y-1][x] = temp;
            }
        }
    }
}
