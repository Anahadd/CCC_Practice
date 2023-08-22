import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 

		System.out.println("Enter the number of elements: "); 
		int size = scan.nextInt(); 
		int[] array = new int[size]; 

		for (int i = 0; i < size; i++) {
			System.out.print("Element " + i + " : ");
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " "); 
		}
		
		int left = 0, right = array.length - 1; 

		while (left < right) {

			if (array[left] % 2 != 0 && array[right] % 2 == 0) {
				int newVal = array[left];
				array[left] = array[right]; 
				array[right] = newVal; 
			}
			else {

				if (array[left] % 2 == 0) {
					left++; 
				}
				if (array[right] % 2 != 0) {
					right--;
				}

			}

		}

		System.out.println(); 
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " "); 
		}
	}

}
