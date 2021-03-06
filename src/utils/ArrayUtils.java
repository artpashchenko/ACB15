package utils;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 16.04.16
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */
public class ArrayUtils {
//              return type
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] createAndFillArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = i;
        }
        return  array;

    }
    
    public static int[] createRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (min + Math.random() * (max - min));
        }
        return  array;
    }

    public  static void bubbleSort(int[] array){
        for (int j = array.length; j > 0; j--){
            for (int i = 0; i < j - 1; i++){
                if (array[i] > array[i + 1]) {
                    int tmp = array[i+1];
                    array[i+1]  = array[i];
                    array[i] = tmp;

        }
    }

}
    }

    public static double findArithmeticalMean(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / 2;

    }

    public static void findMinMaxArrayValue(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Min: " + min + " Max: " + max);;

    }

    public static int[] arrayToOtherArray(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }
        return  array2;
    }

    public static int findValueInArray(int[] array, int value){
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++){
           if (value == array[i]){
             counter ++;
            }

        }
        return  counter;

    }
    
    public static int[] createOddEvenArray(int size, int min, int max){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            int random = (int)(min + Math.random() * (max - min));
            if(i % 2 == 0){
                array[i] = random % 2 == 0 ? random : ++random;
                /*if (random % 2 == 0)
                array[i] = random;
                else
                    array[i] = ++random;*/
//                even number
            }else{
                array[i] = random % 2 == 0 ? ++random : random;
//                Odd number
                /*if (random % 2 == 0)
                array[i] = ++random;
                else
                    array[i] = random;*/
            }
        }
        return array;
    }

    public  static void bubbleSort(String[] array){
        for (int j = array.length; j > 0; j--){
            for (int i = 0; i < j - 1; i++){
                if (array[i].compareTo(array[i + 1]) > 0) {
//                    swap
                    String tmp = array[i+1];
                    array[i+1]  = array[i];
                    array[i] = tmp;

                }
            }

        }
    }
}


