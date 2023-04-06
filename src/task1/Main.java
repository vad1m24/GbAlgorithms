package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HeapSort hp = new HeapSort();
        int[] arr = hp.makingArray(15,100);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(hp.sort(arr)));

    }
}
