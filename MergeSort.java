// time complexity : O(nlogn)
public class MergeSort {

    // mergeSort function
    // Input : array, lower bound, upper bound
    // output : nothing, but sort the array in ascending order
    // time complexity : O(logn)
    public void mergeSort(int a[],int lb,int ub){
    //public void mergeSort(){

        if(lb<ub){
            int mid=(lb+ub)/2;

            // recursive call
            mergeSort(a,lb,mid);
            mergeSort(a,mid+1,ub);

            // merge elements after the dividing
            merge(a,lb,mid,ub);
        }
    }//---> mergeSort()

    // merge() ---- used for merging the sub arrays
    // time complexity : O(n)
    private void merge(int a[],int lb, int mid, int ub){
        int i=lb;// starting point for left sub array
        int j=mid+1;// starting point for right sub array
        int k=lb;// starting point for array where the sorted data stored
        int b[]=new int[ub+1];

        while(i<=mid && j<=ub){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }//---> while()

        if(i>mid){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }else{
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }//---> if-else

        for(k=lb;k<=ub;k++){
            a[k]=b[k];
        }//---> for-loop


    }//---> merge() private

    //display the array
    public void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");
        }
    }//---> display()

    public static void main(String args[]){
        int array[]={15,5,24,8,1,3,16,10,20};

        MergeSort ms=new MergeSort();
        ms.mergeSort(array,0,array.length-1);
        ms.display(array);
    }//---> main()

}//---> class
