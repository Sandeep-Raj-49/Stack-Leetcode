class Solution {
    public int fib(int n) {
        if (n == 0) {
            System.out.print(0);
            System.out.println();
            return 0;
        } else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }
            System.out.println(); 
            return fib[n]; 
        }
    }
}