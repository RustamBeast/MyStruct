package sorting_algorithms;

public class Test {

    //Print the elements of the array
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 15, 22, 1, 2, 3, 11, 31, 5, 21, 22};

        //-----------------------------------
        //BUBBLE SORT
        //Before sorting
        show(array);

        array = BubbleSort.bubbleSort(array);

        //After sorting
        show(array);
        //-----------------------------------


        int[] array2 = {5, 15, 22, 134, 153, 112, 6, 11, 31, 5, 21, 22};

        //-----------------------------------
        //MERGE SORT
        //Before sorting
        show(array2);

        array2 = MergeSort.mergeSort(array2);

        //After sorting
        show(array2);
        //-----------------------------------
    }

}
