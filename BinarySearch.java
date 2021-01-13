
/**
 * applicable on the sorted array
 * time complexity : in best case O(1)
 * worst case : O(logN)
 * use divide & conquer technique
 */
public class BinarySearch {

    public int bSearch(int a[],int size,int data){

        int l=0;    // starting of the array index
        int r=size-1; // highest index of the array

        while(l<=r){// stopping condition for data is not present & also for present at l==r(true)

            int mid=(int)((l+r)/2); // mid point of sub array

            if(data==a[mid])
                return mid;
            else if(data<a[mid])
                r=mid-1;
            else
                l=mid+1;

        }//---> while ended

        return -1;

    }//---> bSearch(array,size,data)

    public static void main(String args[]){
        //int array[]={1,3,5,8,10,33,38,45,49,50,70,77,83,88,93,95,97,100};
        int array[]={5,9,17,23,25,45,59,63,71,89};

        // object creation
        BinarySearch bs=new BinarySearch();

        int data=60;

        if(array[bs.bSearch(array,array.length,data)]==data)
            System.out.println("data found "+data);
        else
            System.out.println("data not found");

    }//---> main()

}//---> class
