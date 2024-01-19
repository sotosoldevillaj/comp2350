public class Mergesort {

    static void mergeSort(int array[], int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;

            mergeSort(array, leftIndex, middle);
            mergeSort(array, middle + 1, rightIndex);

            merge(array, leftIndex, middle, rightIndex);
        }
    }

    static void merge(int array[], int left, int middle, int right) {
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        int[] leftSubarray = new int[sizeLeft];
        int[] rightSubarray = new int[sizeRight];

        for (int i = 0; i < sizeLeft; ++i) {
            leftSubarray[i] = array[left + i];
        }

        for (int j = 0; j < sizeRight; ++j) {
            rightSubarray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                array[k] = leftSubarray[i];
                i++;
            } else {
                array[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            array[k] = leftSubarray[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            array[k] = rightSubarray[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int array[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
