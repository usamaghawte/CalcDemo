package com.morningstar.searchTeam;
import java.util.*;
class work
{
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
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	work w=new work();
        		while (true) {
			System.out.println("********BASIC PROGRAMING*****");
			System.out.println("\n 1:PRIME NUMBER \n 2:FIBONACCI SERIES \n 3:PALINDROME \n 4:ARMSTRONG NUMBER \n 5:Exit");
			System.out.println("  \nSelect your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("@@@@@PRIME NUMBER@@@@@");
				w.prime();
				break;

			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Terminated");
				System.exit(0);
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;

			}

		}

    }
}
