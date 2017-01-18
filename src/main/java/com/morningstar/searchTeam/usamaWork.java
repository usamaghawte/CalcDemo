package com.morningstar.searchTeam;

import java.util.Scanner;

public class usamaWork {

	
	
		void prime() {
			int temp;
			boolean isPrime = true;
			 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number for check:");
			// capture the input in an integer
			int num = sc.nextInt();
			for (int i = 2; i <= num / 2; i++) {
				temp = num % i;
				if (temp == 0) {
					isPrime = false;
					break;
				}
		
			}
	}
	
	
	
	
	
}
