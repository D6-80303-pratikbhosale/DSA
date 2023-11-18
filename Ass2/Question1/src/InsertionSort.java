import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int arr[], int N) {
		int pass=0;
		int comp=0;
		for(int i = 1 ; i < N ; i++){
			pass++;
			int temp = arr[i];
			int j;
			for(j = i-1 ; j >= 0 && arr[j] > temp ; j--) {
				arr[j+1] = arr[j];
				comp++;
			}
			arr[j+1] = temp;
		}
		

		System.out.println("No of Passes : " + pass);
		System.out.println("No of Comparison : " + comp);
	}

	public static void main(String[] args) {
		int arr[] = {10,15,25,20,40,35,30,50,45};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
		
	}
	

}