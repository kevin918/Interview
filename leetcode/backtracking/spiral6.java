package backtracking;

public class spiral6 {
    void spiral (int[][] a) {
        int m = a.length -1; // m is ending row index
        int n = a[0].length -1; // n is ending column index
        int x = 0, y = 0, i;    // x is starting row index, y is the starting column index
        while (x<m && y<n) {

            //print the first row from the remaining rows
            for (i=y; i<n; i++) {
                System.out.print(a[x][i] + " ");
            }
            x++;

            //print the last column from the remaining columns
            for (i=x; i<m; i++) {
                System.out.print(a[i][n-1] + " ");
            }
            n--;

            //print the last row from the remaining rows
            if (x < m) {
                for (i=n-1; i>1; i--) {
                    System.out.print(a[m-1][i] + " ");
                }
                m--;
            }

            //print the first column from the remaining columns
            if (y < n) {
                for (i = m-1; i>0 ;i--) {
                    System.out.println(a[i][y] + " ");
                }
                y++;
            }
        }
    }
}
