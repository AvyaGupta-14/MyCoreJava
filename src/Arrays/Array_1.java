package Arrays;

public class Array_1 {

	public static void main(String[] args)
	{
		/*+
		int[] arr = {10, 20, 30, 40};

		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}

*/
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(arr.length);
		int sum = 0;

		int n1=1, n2=4;
		sum=sum+n2;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nSum of your arr: "+sum);
		
	}

}