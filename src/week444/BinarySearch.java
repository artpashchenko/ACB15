package week444;

import java.util.Arrays;

/**
 * Created by Артем on 18.06.2016.
 */
public class BinarySearch {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        int[] array = {5,6,9,3,2,0,4,8,9};
        boolean isContain = contains(array,8);

        Arrays.sort(array);
        int[]sortedArray = array;

        boolean isContain2 = binarySearch(sortedArray,8);

    }

    private static boolean binarySearch(int[] sortedArray, int number) {
        int start = 0;
        int end = sortedArray.length -1;


        while (start != end){
            int middle = start + (end - start)/2;
            if(sortedArray[middle] < number){
                start = middle +1;
            }
            else if(sortedArray[middle] > number){
                end = middle - 1;

            }else{
                return true;

            }
        }
        return false;
    }

    private static boolean contains(int[] array, int number){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == number) return true;
        }
        return false;
    }
}
