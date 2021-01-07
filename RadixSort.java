public class RadixSort {

    // calculate maximum number value in array
    // time complexity : O(n)=O(n-1)
    public int getMax(int array[],int size){
        int max=array[0];
        for(int i=1;i<size;i++){
            if(max<array[i]){
                max=array[i];
            }
        }//---> for-loop

        return max;
    }//---> getMax(array,size

    // display the entire array
    // time complexity : O(n)
    public void display(int array[],int size){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }//---> display(array,size)

    /** RADIX SORT **
     * Time Complexity: O( maxLength*(4n+k))
     */
    public void sort(int array[],int size){
        // calculate maximum value
        int max=getMax(array,size);

        // countSort can run on the length of the array
        // let maximum value is 8888=4-digits
        // than for loop can run 4 times
        for(int pas=1;(max/pas)>0;pas*=10){
            countSort(array,size,pas);
        }//---> for-loop ended

    }//---> sort(array,size) ended

    /**
     * perform the count sort with out comparing
     * @param array : address of array
     * @param size  : size of array
     * @param pas   : for unit,ten,hundred,etc. values
     * TIME COMPLEXITY : O(3N+k) ---> (arraySize,countArraySize)
     */
    public void countSort(int array[],int size,int pas){

        // declare array with 10 elements initialize with 0-value
        // because pas-value would be 1-9
        int countSize=10;
        int count[]=new int[countSize];

        // declare and initialize SortedArray
        int sortedArray[]=new int[size];

        // count the elements in count-Array
        // time complexity: O(n)
        for(int i=0;i<size;i++){
            ++count[(array[i]/pas)%10];
        }

        // sum the count-array by adding two consective values except 0-index value
        // time complexity: O(countSize)
        // currently countSize=10
        for(int i=1;i<countSize;i++){
            count[i]=count[i]+count[i-1];
        }

        // time complexity : O(n)
        for(int i=size-1;i>=0;i--){
            sortedArray[--count[(array[i]/pas)%10]]=array[i];
        }

        // copying two sortedArray into intial Array
        // time complexity : O(n)
        for(int i=0;i<size;i++){
            array[i]=sortedArray[i];
        }

    }//---> countSort() ended


    public static void main(String args[]){
        RadixSort radix=new RadixSort();

        int arr[]={83,22,10,38,230,183,999};

        radix.sort(arr,arr.length);

        radix.display(arr,arr.length);

    }//---> main() ended
}//---> class ended
