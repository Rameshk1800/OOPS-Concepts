package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * for(int num = 1; num<= 500; num++ ) { System.out.println("*"); }
		 */

		
		for(int i =1; i<=5;i++) {
			for(int j =1; j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.print("\n");
			
			
		}
	}

}
