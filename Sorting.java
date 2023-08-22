import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        System.out.println(""); 
        
        int size = scan.nextInt(); 
        int [] array = new int[size];
        
        for (int i = 0; i < size; i++){
            
            System.out.println("");
            int storeVal = scan.nextInt(); 
            array[i] = storeVal; 
            
        }
        
        // Sorting 
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				
				if (array[i] > array[k]) {
					int temp = array[i]; 
					array[i] = array[k]; 
					array[k] = temp; 
				}
				
			}
		}
		
		for (int k = 0; k < array.length; k++){
		    System.out.println(array[k]);
		}
    }
}
