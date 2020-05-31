package sorting_algorithms;

public class MergeSort {

    //Merge sort algotithm
    public static int[] mergeSort(int[] array){
        int[] result = new int[array.length];
        if (array.length <= 1)
            return array;

        int middle = array.length/2;

        int[] leftSubArray = new int[middle];
        int[] rightSubArray;

        if (array.length % 2 == 0)
            rightSubArray = new int[middle];
        else rightSubArray = new int[middle + 1];

        for (int i = 0; i < leftSubArray.length; i++)
            leftSubArray[i] = array[i];

        for (int i = 0; i < rightSubArray.length; i++)
            rightSubArray[i] = array[middle + i];

        leftSubArray = mergeSort(leftSubArray);
        rightSubArray = mergeSort(rightSubArray);

        result = merge(leftSubArray, rightSubArray);

        return result;
    }

    private static int[] merge(int[] leftSubArray, int[] rightSubArray){

        int[] result = new int[leftSubArray.length + rightSubArray.length];

        int leftPointer = 0, rightPointer = 0, resultPointer = 0;

        while (leftPointer < leftSubArray.length || rightPointer < rightSubArray.length){
            if (leftPointer < leftSubArray.length && rightPointer < rightSubArray.length){
                if (leftSubArray[leftPointer] < rightSubArray[rightPointer]){
                    result[resultPointer] = leftSubArray[leftPointer];
                    resultPointer++;
                    leftPointer++;
                }
                else {
                    result[resultPointer] = rightSubArray[rightPointer];
                    resultPointer++;
                    rightPointer++;
                }
            }
            else if (leftPointer < leftSubArray.length){
                result[resultPointer] = leftSubArray[leftPointer];
                resultPointer++;
                leftPointer++;
            }
            else if (rightPointer < rightSubArray.length){
                result[resultPointer] = rightSubArray[rightPointer];
                resultPointer++;
                rightPointer++;
            }
        }

        return result;

    }

}
