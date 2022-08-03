package Assisted4;

public class InsertionSort {
	public static void main(String[] args) {

		// int[] arr = {9,12,3,21,44};
		int[] arr = { 132, 109, 16, 59, 60};
		// int[] arr = {7,9,21,100,121,11,51,62};
		insertionSort(arr);
		// printing array
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " \t");
		}
	}

	public static void insertionSort(int[] arr) {

		int len = arr.length;

		for (int j = 1; j < len; j++) {

			int key = arr[j];

			int i = j - 1;

			while ((i > -1) && (arr[i] > key)) {

				arr[i + 1] = arr[i];

				i--;
			}
			arr[i + 1] = key;
		}
	}

}