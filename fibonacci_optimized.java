// Java Program to find n'th fibonacci
// Time Complexity : O(Log n)
// input : number --> fibonacci term number
// output : fibonacci series number
// handling : nothing

// reference study material link
// https://en.wikipedia.org/wiki/Fibonacci_number#Matrix_form

import java.util.*;

class fibonacci_optimized {

    static int MAX = 1000;
    static int f[];

    // Returns n'th fibonacci number using
    // table f[]
    public static int fib(int n)
    {
        // Base cases
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return (f[n] = 1);

        // If fib(n) is already computed
        if (f[n] != 0)
            return f[n];

        int k = (n & 1) == 1? (n + 1) / 2
                : n / 2;

        // Applying above formula [Note value
        // n&1 is 1 if n is odd, else 0.
        f[n] = (n & 1) == 1? (fib(k) * fib(k) +
                fib(k - 1) * fib(k - 1))
                : (2 * fib(k - 1) + fib(k))
                * fib(k);

        return f[n];
        
    }// --> fib()

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 47;
        f= new int[MAX];
        System.out.println(fib(n));
    }// --> main()
    
}// --> class
