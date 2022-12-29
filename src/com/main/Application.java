package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of digits: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int k = 1; k <i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*(n-i)+1 ; j++) {
				System.out.print("*");				
			}
			System.out.println("");
		}

	}

}
