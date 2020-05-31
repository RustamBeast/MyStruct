package sorting_algorithms;

public class BubbleSort {

    //Bubble sort algotithm
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int k = i + 1; k < array.length; k++){
                if (array[k] < array[i]){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        return array;
    }

}
