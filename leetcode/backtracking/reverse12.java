package backtracking;

public class reverse12 {
    static int reverse (int n) {
        boolean flag = false;
        if (n < 0) {
            flag = true;
            n = -n;
        }
        int preRev = 0;
        int rev = 0;
        while (n != 0) {
            int cur = n%10;
            rev = rev*10 + cur;

            if ((rev - cur)/10 != preRev ) {
                return 0;
            }

            preRev = rev;
            n = n/10;
        }
        return (flag=true) ? - rev : rev;
    }
    public static void main (String[] args) {
        int num = 123456;
        System.out.println("123456 reverse = " + reverse(num));
    }
}
