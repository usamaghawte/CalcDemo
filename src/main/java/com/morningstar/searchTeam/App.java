package com.morningstar.searchTeam;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	Scanner sc=new Scanner(System.in);
    	usamaWork uw=new usamaWork();
        		while (true) {
			System.out.println("********BASIC PROGRAMING*****");
			System.out.println("\n 1:PRIME NUMBER \n 2:FIBONACCI SERIES \n 3:PALINDROME \n 4:ARMSTRONG NUMBER \n 5:Exit");
			System.out.println("  \nSelect your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("@@@@@PRIME NUMBER@@@@@");
				uw.prime();
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
