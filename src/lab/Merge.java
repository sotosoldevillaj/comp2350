package lab;

public class Merge {
	
	    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
	        int leftSize = leftHalf.length;
	        int rightSize = rightHalf.length;

	        int i = 0;
	        int j = 0;
	        int k = 0;

	        while (i < leftSize && j < rightSize) {
	            if (leftHalf[i] <= rightHalf[j]) {
	                inputArray[k] = leftHalf[i];
	                i++;
	            } else {
	                inputArray[k] = rightHalf[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < leftSize) {
	            inputArray[k] = leftHalf[i];
	            i++;
	            k++;
	        }

	        while (j < rightSize) {
	            inputArray[k] = rightHalf[j];
	            j++;
	            k++;
	        }
	    }
	}