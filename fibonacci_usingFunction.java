
// fibonacci Function
// Fn = {[(√5 + 1)/2] ^ n} / √5
// input : "n" enter nth-term
// output: return fibonacci number
// time complexity : O(1) for 1-47 fibonacci terms


// if Math functions are not working than use this
// java.lang.Math.*;

public class fibonacciFunction {

    public int fib(int fTerm){
        return (int) Math.round((Math.pow((Math.sqrt(5)+1)/2,fTerm))/Math.sqrt(5));
    }// --> fib()

    public static void main(String args[]){

        fibonacciFunction fibonacci=new fibonacciFunction();

        // enter the nth-term fibonacci series
        int fibTerm=5;

        System.out.println("fibonacci number : "+fibonacci.fib(fibTerm));
    }// --> main

}// --> class
