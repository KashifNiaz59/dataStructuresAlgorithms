public class CountingSort {

    // calculate the maximum number in the array
    // input : array-address, size
    // output: maximum number in array
    // time complexity: O(n)
    public int calculateMax(int array[],int aSize){
        int max=array[0];
        for(int i=1;i<aSize;i++){
            if(array[i]>max){
                max=array[i];
            }
        }//---> for-loop ended
        return max;
    }//---> calculateMax(array,size)


    // display entire array
    // time complexity: O(n)
    public void display(int array[],int size){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }//---> display(array,size) ended

    /**
     * @param array : array address
     * @param length : length of array
     * TIME COMPLEXITY : O(n+n+n+n+k)
     * SPACE COMPLEXITY : O(4n+k)
     * sorting with-out comparison
     */
    public void sort(int array[],int length){

        int max;// holding maximum number of initial array
        int countArray[];// holding counted keys
        int sortArray[]=new int[length];// holding sorted array


        // calculate maximum value from the array
        // because counted-array size = maximum number in initial array
        // time Complexity : O(n) where n is length of array
        max=calculateMax(array,length);

        // counting key values
        // Time Complexity : O(n)
        countArray=new int[max+1];
        for(int i=0;i<length;i++){
            countArray[array[i]]++;
        }

        // sum key values of countArray
        // Time Complexity : O(k) where k is maximum number in array
        for(int i=1;i<=max;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }


        // traverse the array from the right
        // because we maintain the stability of algorithm
        // Time complexity : (n) where n is length of array
        for(int i=length-1;i>=0;i--){
            sortArray[--countArray[array[i]]]=array[i];
        }

        // copy sortArray into initial array
        // Time Complexity : O(n) where n is length of array
        for(int i=0;i<length;i++){
            array[i]=sortArray[i];
        }

    }//---> sort(array,length) ended


    public static void main(String args[]){

        CountingSort count=new CountingSort();

        // declare and initialize the array
        int arr[]={1,3,5,2,2,3,2,1,0,8,4,6,5,6,6,7,8,7,9};
        System.out.println("initial array ");
        count.display(arr,arr.length);

        // sort the array
        count.sort(arr,arr.length);

        // display sorted array
        System.out.println("sorted/final array");
        count.display(arr,arr.length);

    }//---> main() ended

}//---> class ended
