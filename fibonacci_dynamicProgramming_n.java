// fibonacci series -- Dynamic Programming --
// time complexity : O(n)

public class fibonacci_dynamicProgramming {

    public int fib(int aNum){

        // declare array of size n+2
        int arr[]=new int[aNum+2];

        // initialize the first two elements of array
        // with 0 & 1
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=aNum;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        // return the fibonacci number
        return arr[aNum];
    }// --> fib

    public static void main(String args[]){
        fibonacci_dynamicProgramming fibDP=new fibonacci_dynamicProgramming();

        // enter number, how long you want to display the fibonacci series
        int num=5;

        for(int i=0;i<num;i++){
            System.out.print(fibDP.fib(i)+" ");
        }

        // output : 0,1,1,2,3
        
    }// --> main
}// --> class
