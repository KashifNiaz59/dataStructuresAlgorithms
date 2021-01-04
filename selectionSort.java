public class selectionSort {

    /**
     * Time Complexity : O(n^2) in all cases
     * @param array : array name
     * output : void but sorting the array in ascending order
     */
    public void sort(int array[]){
        int size=array.length;

        // outter loop iterate n-1 times
        for(int i=0;i<size-1;i++){
            int min=i;

            // inner loop iterate n-1 times
            // because first element of array not participated in comparison
            for(int j=i+1;j<size;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }//---> inner for-loop ended

            // swap i-th element with the minimum element
            // swap(array[min],array[i]
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;

        }//---> outter for-loop ended
    }//---> sort(array) ended


    // display the array
    public void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();

    }//---> display(array)


    public static void main(String args[]){
        selectionSort s=new selectionSort();

        // declare and intilize the array
        int arr[]={3,1,888,33,29,321,555};

        s.sort(arr);

        s.display(arr);
    }//---> main()

}//---> class()
