package Arrays;

class insertion {
	public static int[] insert(int val, int idx, int[] arr) {
		int[] newArr = new int[arr.length + 1];


		for (int i = 0; i < idx; i++) {
			newArr[i] = arr[i];
		}


		newArr[idx] = val;

		for (int i = idx; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}
		return newArr;
	}


	public static void main(String[] args) {
		int[] arr = {1, 3, 9, 7, 8};
		arr = insert(2, 2, arr);


		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
