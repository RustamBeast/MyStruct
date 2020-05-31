package sorting_algorithms;

public class Test {

    //Bubble sort algotithm
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int k = i + 1; k < array.length; k++){
                if (array[k] < array[i]){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }

    //

    //Print the elements of the array
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 15, 22, 1, 2, 3, 11, 31, 5, 21, 22};
        //Before sorting
        show(array);

        bubbleSort(array);

        //After sorting
        show(array);
    }

}
