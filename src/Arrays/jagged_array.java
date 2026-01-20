package Arrays;

public class jagged_array {
	public static void printArr(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int []arr[] = new int[3][3];
		
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[7];
		
		printArr(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
	}

}
