//Multiplication Table
package javaprograms;
import java.util.Scanner;
import java.util.*;

public class MultiplyTable {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter any number for table generation");
		
		 int n=src.nextInt();
        
        for (int i=1;i<10;i++)
        {
        	
        	System.out.println();
             
			  System.out.println(n + "*" + i + "=" + (n*i));  
			
			// System.out.printf("%d * %d = %d \n", n, i, n * i);
  
        	
        }

	}

}
