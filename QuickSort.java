/**
 * TIME COMPLEXITY:
 * Worst Case: O(n^2)
 * Best & Average Case : O(N logN)
 */
public class QuickSort {

    // Partition(array,lowerBound,upperBound)
    // Output: position of pivot number
    public int partition(int a[],int lb,int ub){
        int pivot=a[lb];
        int start=lb;
        int end=ub;

        while(start<end){

            // while loop for start elements
            while(a[start]<=pivot){
                start++;
                if(start==ub){
                    break;
                }
            }

            // while loop for end elements
            while(a[end]>pivot){
                end--;
                if(end==0)
                    break;
            }

            if(start<end){
                //swap(a[start],a[end]);
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }// ---> if

        }// ---> while

        //swap(a[lb],a[end]);
        int temp=a[lb];
        a[lb]=a[end];
        a[end]=temp;

        return end;
    }//---> partition()

    // swap(int,int)
    // swap two number with each other
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }//---> swap()

    public void quickSort(int a[],int lb,int ub){

        if(lb<ub){
            int loc=partition(a,lb,ub);
            quickSort(a,lb,loc-1);
            quickSort(a,loc+1,ub);
        }//---> if
    }//---> quickSort()

    public void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }
    }//---> display()
    public static void main(String args[]){

        // array for sorting
        int array[]={3,8,0,33,2,1,88,12,120};

        QuickSort qs=new QuickSort();
        qs.quickSort(array,0,array.length-1);

        qs.display(array);

    }//---> main()

}//---> class
