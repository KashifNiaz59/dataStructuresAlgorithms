import java.util.Arrays;
import java.util.Iterator;

public class insertionSort {

    // insertion sort algorithm in java
    // time complexity : O(n^2)
    // input : array
    // output : sort the array
    public void sort(int [] array){

        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;

        }//---> for-loop

    }//---> sort(array)

    public static void main(String args[]){
        int[] arr=new int[]{3,9,33,0,234};

        insertionSort iSort=new insertionSort();
        iSort.sort(arr);

        Iterator<Integer> myArray= Arrays.stream(arr).iterator();
        while(myArray.hasNext()){
            System.out.println(myArray.next());
        }
    }//---> main()

}//---> class
