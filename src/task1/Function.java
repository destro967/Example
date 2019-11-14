package task1;

import java.util.Arrays;
import java.util.Random;

public class Function {

    public static float sum(float a, float b) {
        return a + b;
    }


    public static float max(float a, float b, float c) {
        if(a>b&&a>c)return a;
        if(b>a&&b>c)return b;
        return c;
    }

    static int[] array = new int[25];
    public static void init() {
        Random r = new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i] = r.nextInt();
        }
    }

    public static void outMas() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(max(2,4,1));
        init();
        outMas();
    }



}
