package com.morningstar.searchTeam;

import java.util.Scanner;
import java.util.*;
public class usamaWork {
	 Scanner sc = new Scanner(System.in);
	
	
		void prime() {
			int temp;
			boolean isPrime = true;
			 //Scanner sc = new Scanner(System.in);
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
			if(isPrime)
			{
				System.out.println("Is a prime number");
				
				
			}
			else
			{
				System.out.println("Not a prime number");
			}
	}
	
		void arm()
		{
			System.out.println("Enter a  Arm strong number:");
			String arm=sc.nextLine();
			char[] num=arm.toCharArray();
			Integer temp=0;
			for(int i=0;i<num.length;i++)
			{
				temp+=((Integer.parseInt(Character.toString(num[i])))*(Integer.parseInt(Character.toString(num[i])))*(Integer.parseInt(Character.toString(num[i]))));
			}
			if(arm.equalsIgnoreCase(temp.toString())){
				System.out.println("ARMSTRONG NUMBER"+temp);
			}
			else
			{
				System.out.println("NOT AN ARMSTRONG NUMBER"+temp);
				
			}
			
			
			
		}
	
	
	
	
}
