public class ShellSort {

    // shell sort
    // using shell's original sequence
    // time complexity depends on the shell's sequence (gap)
    // time complexity :
    //                  Worst Case : O(n^2) less than or equal to this
    //                  Average and Best Case : O(N*logN)
    public void sort(int array[],int size){

        for(int gap=size/2;gap>=1;gap/=2){// 1-for-loop
            for(int j=gap;j<size;j++){// 2-for-loop
                for(int i=j-gap;i>=0;i-=gap){// 3-for-loop
                    if(array[i+gap]>array[i]){
                        break;
                    }else{
                        // swap(a[i+gap],a[i])
                        int temp=array[i+gap];
                        array[i+gap]=array[i];
                        array[i]=temp;
                    }
                }//---> 3-for-loop
            }// 2-for-loop
        }// 1-for-loop

    }//---> sort(array,size) ended

    // display entire array
    // time complexity : O(n)
    public void display(int array[],int size){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }//---> display(array,size) ended

    public static void main(String args[]){
        ShellSort shell=new ShellSort();

        // intialize and declare the array
        int arr[]={88,2,10,83,22,34,92,0,21};

        System.out.println("display initial array ");
        shell.display(arr,arr.length);

        // perform shell short
        shell.sort(arr,arr.length);

        // display array
        System.out.println("sorted array ");
        shell.display(arr,arr.length);

    }//---> main() ended

}//---> class ended
