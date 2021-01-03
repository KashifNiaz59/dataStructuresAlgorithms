public class BubbleSort {

    /**
     * @param array: array name
     * @param size: size of array
     * Time Complexity:
     *            Best Case:    O(n^2) --- if we consider the flag variable than it O(n)
     *            Average Case: O(n^2)
     *            Worst Case:   O(n^2)
     */
    public void bubbleSort(int array[],int size){

        // outer loop
        for(int i=0;i<size-1;i++){

            // inner loop
            for(int j=0;j<size-1;j++){

                // if 1st number greater than 2nd number
                // than swap both
                if(array[j]>array[j+1]){
                    // swap them
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }//---> if

            }//---> for-loop

        }//---> for-loop

    }//---> bubbleSort(array,size)


    /**
     * @param array : array name(address)
     * @param size : size of array
     * Time Complexity: Worst, Average, Best : O(n)
     */
    public void display(int array[],int size){
        for(int i=0;i<size;i++)
            System.out.print(array[i]+" --> ");

    }//---> display(array,size)

    public static void main(String args[]){
        // declare and intialize the array
        int arr[]={5,9,2,3,10,44,100,80,4};

        // sort the array
        BubbleSort bSort=new BubbleSort();
        bSort.bubbleSort(arr,arr.length);

        // dispaly the array
        bSort.display(arr,arr.length);

    }//---> main()

}//---> class
