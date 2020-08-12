package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] myarray = {20,35,-15,7,55,1,-22};
        for (int lastUnsortedIndex = myarray.length-1;lastUnsortedIndex > 0 ;lastUnsortedIndex--){
           int largest=0;
            for(int i=1; i<=lastUnsortedIndex;i++){
                if(myarray[i] > myarray[largest]){
                    largest = i;
                }
            }
            swap(myarray,largest,lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(myarray));

    }
    public static void swap(int array[], int i ,int j){
        if(i==j){
            return;
        }
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

