package task1;

public class HeapSort {

    public int[] sort(int[] arr) {
        for (int i = (arr.length / 2 - 1); i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }

    private void heapify(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int l = 2 * rootIndex + 1;
        int r = 2 * rootIndex + 2;

        if (l < heapSize && arr[l] > arr[largest])
            largest = l;

        if (r < heapSize && arr[r] > arr[largest])
            largest = r;

        if (largest != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, heapSize, largest);
        }
    }

    public int[] makingArray(int arrayLength, int maxRandom) {
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = (int) (Math.random() * ++maxRandom);
        }
        return myArray;
    }

}
