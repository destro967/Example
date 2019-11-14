package task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VstavkaBinSearxh {

    public static void main(String[] args) {

        int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i] = Math.abs(random.nextInt()%1000);
        }

        System.out.println(Arrays.toString(array));


        for ( int bourder = 1; bourder < array.length  ; bourder++ ) {
            int position = binSearch(array, array[bourder], bourder );

            if (position < 0) {
                position = -position - 1;
            }


            int tmp = array[bourder];
            System.arraycopy(array, position, array, position + 1, bourder - position);
            array[position] = tmp;

            System.out.println(Arrays.toString(array));

        }


        System.out.println(Arrays.toString(array));






    }

    private static int binSearch(int[] ms, int element, int bourder){

        int low = 0;
        int high = bourder -1;

        while(low <= high) {
            int mid = low + high >> 1;
            int midVal = ms[mid];
            if (midVal < element) {
                low = mid + 1;
            } else {
                if (midVal <= element) {
                    return mid;
                }

                high = mid - 1;
            }
        }

        return -(low + 1);
    }


}
