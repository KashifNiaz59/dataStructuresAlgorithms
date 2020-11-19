// Fibonacci Series -- Power of the Matrix --
// time complexity : O(n)
// input : nth fibonacci series number
// output : display nth fibonacci number
// handle : nothing

public class fibonacci_powerOfMatrix {

    //
    static int fib(int n){
        int F[][]=new int[][]{{1,1},{0,1}};

        if(n==0)
            return 0;
        power(F,n-1);

        return F[0][0];
    }// --> fib()

    static void multiply(int F[][],int M[][]){
        int x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
        int y=F[0][0]*M[0][1]+F[0][1]*M[1][1];
        int z=F[1][0]*M[0][0]+F[1][1]*M[1][0];
        int w=F[1][0]*M[0][1]+F[1][1]*M[1][1];

        F[0][0]=x;
        F[0][1]=y;
        F[1][0]=z;
        F[1][1]=w;

    }// --> multiply()

    // helper function
    // that calculates F[][] raise to power n & put result in F[][]

    static void power(int F[][],int n){
        int i;
        int M[][]=new int[][]{{1,1},{1,0}};

        // n+1 times multiply the matrix to {{1,0},{0,1}}
        for( i=2;i<=n;i++){
            multiply(F,M);
        }
    }// --> power

    public static void main(String args[]){

        // enter the number for n-terms of fibonacci series
        int n=9;

        System.out.print(fib(n));

    }// --> main()

}// --> class
