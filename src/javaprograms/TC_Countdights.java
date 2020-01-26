package javaprograms;
import java.util.Scanner;
import java.util.*;


public class TC_Countdights {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter any digit");

        int n=src.nextInt();
        int i;
        for( i=1; i<n; i++)
        {
        	
        	n=n/10;
        }
        System.out.println("Number of digits is " +i);

	}

}

