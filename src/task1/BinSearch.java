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

        int left = 0;
        int right = array.length-1;
        int element = scanner.nextInt();

        if(element < array[left]) {
            System.out.println("-1");
            return;
        }
        if (element > array[right]) {
            System.out.println(array.length - 1);
            return;
        }
        int midle;
        while (right != left){
            midle  = (right + left)/2+1;

            if(array[midle] == element){
                System.out.println(midle);
                return;
            }else{
                if (array[midle] < element)
                    left = midle + 1;
                else
                    right = midle - 1;
            }
        }

        System.out.println(-right-1);

    }
}
