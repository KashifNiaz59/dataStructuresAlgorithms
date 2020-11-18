// Fibonacci Series  --- RECURSIVE METHOD ---
// Time Complexity : O(2^n)
// input : integer --> how many fibonnaci number be represented --> 5
// output : show fibonacci series --> 0,1,1,2,3,5,8,13,...
// handles : nothing

public class Fibonacci_Recursive_2 {

    // calculate the fibonacci number
    // output : return fibonacci series number
    public int fib(int aNum){
        if(aNum==0)
            return 0;
        else if(aNum==1)
            return 1;
        else
            return(fib(aNum-1)+fib(aNum-2));
    }


    public static void main(String args[]){
        Fibonacci_Recursive_2 fib=new Fibonacci_Recursive_2();

        // enter number how many fibonacci series return
        int num=8;

        for(int i=0;i<num;i++){
            System.out.print(fib.fib(i)+" ");
        }
        
        // output : 0,1,1,2,3,5,8,13
        
    }// --> main
}// --> class
