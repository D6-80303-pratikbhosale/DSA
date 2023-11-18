package sort;

import java.util.Arrays;

public class SortSalary {
	
	public static void insertionSort(Employee[] arr) {
		Employee temp;
		int pass=0;
		int comp=0;
		for(int i = 1 ; i < arr.length ; i++){
			pass++;
			temp = arr[i];
			int j;
			for(j = i-1 ; j >= 0 && arr[j].getSalary() > temp.getSalary() ; j--) {
				arr[j+1] = arr[j];
				comp++;
			}
			arr[j+1] = temp;
		}
		

		System.out.println("No of Passes : " + pass);
		System.out.println("No of Comparison : " + comp);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Yash",25000);
		Employee e2 = new Employee(2,"Pratik",17000);
		Employee e3 = new Employee(3,"Amar",35000);
		Employee e4 = new Employee(4,"Ritesh",20000);
		Employee e5 = new Employee(5,"Akshat",22000);
		
		Employee [] arr = {e1,e2,e3,e4,e5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
		
	}
	

}