import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] topRow = new int[] {1, 2}; 
		int[] bottomRow = new int[] {3, 4}; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		String commands = scan.next(); 
		
		for (int i = 0; i < commands.length(); i++) {
			
			if (commands.charAt(i) == 'H') {
				
				int tr = topRow[0]; 
				topRow[0] = bottomRow[0]; 
				bottomRow[0] = tr; 
				
				int br = topRow[1]; 
				topRow[1] = bottomRow[1]; 
				bottomRow[1] = br; 
				
			}
			else if (commands.charAt(i) == 'V'){
			    
			    int vr = topRow[0];
			    topRow[0] = topRow[1];
			    topRow[1] = vr; 
			    
			   
			    int brr = bottomRow[0];
			    bottomRow[0] = bottomRow[1];
			    bottomRow[1] = brr;
			    
			    
			}

		}
    
    printArrays(topRow, bottomRow); 
		
    }
    public static void printArrays(int[] topRow, int[] bottomRow){
        
        System.out.println(topRow[0] + " " + topRow[1]);
        System.out.println(bottomRow[0] + " " + bottomRow[1]);
        
        
        
    }
}
