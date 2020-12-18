
import java.util.Scanner;

/**
 * linear Search with **** ARRAY ****
 * insert(array,data)       O(n)
 * display(array)           O(n)
 * search(array,data)       O(n)
 */

public class linearSearch {
        private int count=0;

    //*********** insert ******************
    /*
    input : array, data
    output: nothing
    handling: exception("array out of box")
     */
    public void insert(int[] aArray,int aData){
        try{
            aArray[count]=aData;
            count++;
        }catch(Exception e){
            System.err.println(e);
        }
    }//---> insert(array,int)

    //******************* display entire array *************
    public void display(int [] aArray){

        for(int i=0;i<aArray.length;i++)
            System.out.print(aArray[i]+" , ");
        System.out.println();
    }//---> display

    //************* search ******************
    /*
    input : array, data
    output : if data found than display msg
             otherwise display nothing
     */
    public void search(int[] aArray,int aData){
        for(int i=0;i<aArray.length;i++){
            if(aArray[i]==aData){
                System.out.println("Successfully find the data");
                break;
            }

        }//---> for-loop
    }//---> search(array,int)

    public static void main(String args[]){
        int [] array=new int[5];

        linearSearch ls=new linearSearch();

        ls.insert(array,2);
        ls.insert(array,70);
        ls.insert(array,8);
        ls.insert(array,10);
        ls.insert(array,18);


        // display the entire array
        System.out.println("entire array ");
        ls.display(array);

        // searching the data
        ls.search(array,10);
    }//---> main

}//---> class
