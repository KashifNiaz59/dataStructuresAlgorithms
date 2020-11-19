// fibonacci series -- using WHILE loop --
// time complexity : O(n)
// input : n-term for fibonacci series
// output : display fibonacci series
// handling nothing

public class fibonacci_while {

    public void fibSeries(int aNum){

        // initialize the first two fibonacci number
        int fib0=0;
        int fib1=1;

        // declare variables using in loop & fibSum
        int i=1;
        int fibSum=0;

        while(i<=aNum){

            System.out.print(fib0+" ");
            fibSum=fib0+fib1;
            fib0=fib1;
            fib1=fibSum;

            // increment loop
            i++;
        }// --> while loop

    }// --> fibSeries()

    public static void main(String args[]){

        // enter number for n-terms of fibonacci series
        int num=9;

        fibonacci_while fib=new fibonacci_while();
        fib.fibSeries(num);
        System.out.println();
        
        // output :
    }// --> main()

}// --> class
