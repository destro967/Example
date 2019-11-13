package task1;

import java.util.Arrays;
import java.util.Random;

public class Vstavka {

    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i] = Math.abs(random.nextInt()%1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int j = 0, key = 0;
        for (int i = 0; i< array.length;i++) {
            j = i - 1;
            key = array[i];
            while (j >=0 && array[j] > key  ) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }

        System.out.println(Arrays.toString(array));


    }

}
