package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HeapSort hp = new HeapSort();
        System.out.println(Arrays.toString(hp.sort(hp.makingArray(20,20))));

    }
}
