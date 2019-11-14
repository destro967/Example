package task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinSearch {

    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i] = Math.abs(random.nextInt()%1000);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt();

        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = low + high >>> 1;
            int midVal = array[mid];
            if (midVal < element) {
                low = mid + 1;
            } else {
                if (midVal <= element) {
                    System.out.println(mid);;
                }

                high = mid - 1;
            }
        }

        System.out.println(-(low + 1));

    }
}
