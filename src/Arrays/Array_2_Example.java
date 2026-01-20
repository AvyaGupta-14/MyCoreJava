package Arrays;

public class Array_2_Example {
	/*public static void printArr(int... varArgs) {
		for (int i = 0; i < varArgs.length; i++) {
			System.out.print(varArgs[i] + " , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 2, 3, 53, 56 };

		//printArr(arr);
		printArr(21, 22, 34, 2, 3, 53, 56);
		printArr(3, 53, 56);
		printArr(21, 2, 56);
		printArr(21, 1, 1, 1, 3, 53, 56);

	}
	*/
	
	public static void printArr(int arr[]) {

		for (int n : arr) {
			System.out.println("for-each : " + n);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 2, 3, 53, 56 };

		printArr(arr);

	}
	
	/*
	public static void printArr(int arr[]) {

		for (int i=0; i<= arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 2, 3, 53, 56 };

		printArr(arr);

	}
	*/
}
