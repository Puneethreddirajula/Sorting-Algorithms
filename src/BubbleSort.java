import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[]  myarray = {20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex=myarray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i<lastUnsortedIndex; i++){
               if (myarray[i]>myarray[i+1]) {
                   swap(myarray, i, i + 1);
               }
            }
            System.out.println(Arrays.toString(myarray));
        }
        for (int i=0;i<myarray.length;i++){
            System.out.println(myarray[i]);
        }

    }

    /**
     * function to swap
     * @param array passing input array
     * @param i index of array
     * @param j index of array
     */
    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j] ;
        array[j] = temp;
    }

}
