package task1;

import java.util.Arrays;
import java.util.Random;

public class BubleSort {

    public static void main(String[] args) {
       int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i] = Math.abs(random.nextInt()%1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
