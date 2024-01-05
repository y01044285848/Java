package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int [] arr1;
		int [] arr2;
		int [] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		arr2[0] = 2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr2 == arr3);
		for(int i : arr2) System.out.print(i);
		System.out.println();
		for(int i : arr3) System.out.print(i);
		
	}
}
