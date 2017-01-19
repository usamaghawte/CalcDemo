<<<<<<< HEAD

package com.morningstar.searchTeam;

import java.util.Scanner;
=======
package com.morningstar.searchTeam;

import java.util.*;
>>>>>>> 35f8ff1a01c3464f435a9843e8f60327621eea08

/**
 * Hello world!
 *
 */
<<<<<<< HEAD
public class App {
=======
public class App 
{
>>>>>>> 35f8ff1a01c3464f435a9843e8f60327621eea08
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MaddyWork md = new MaddyWork();
		usamaWork w = new usamaWork();
<<<<<<< HEAD
		while (true) {
=======
		while (false) {
>>>>>>> 35f8ff1a01c3464f435a9843e8f60327621eea08
			try {
				System.out.println("********BASIC PROGRAMING*****");
				System.out.println(
						"\n 1:PRIME NUMBER \n 2:FIBONACCI SERIES \n 3:PALINDROME \n 4:ARMSTRONG NUMBER \n 5:Exit");
				System.out.println("  \nSelect your choice:");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("@@@@@PRIME NUMBER@@@@@");
					w.prime();
					break;
				case 3:
					System.out.println("@@@@@ PALINDROME @@@@@");
					System.out.println("Enter Data to Check Palindrome");
					String palin = sc.nextLine().trim();
					if (md.palindrome(palin))
						System.out.println(palin + " is Palindrome");
					else
						System.out.println(palin + " is not a Palindrome");
					break;
				case 2:
					System.out.println("@@@@@ FIBONACCI SERIES @@@@@");
					System.out.println("Enter First Number of Fibonnaci Series");
					int f1 = sc.nextInt();
					System.out.println("Enter Second Number of Fibonnaci Series");
					int f2 = sc.nextInt();
					md.fibonnaciS(f1, f2);
<<<<<<< HEAD
					//Hello This is mandar
=======
					//override
>>>>>>> 35f8ff1a01c3464f435a9843e8f60327621eea08
					break;
				case 4:
					System.out.println("@@@@@ ARM STRONG NUMBER @@@@@");
					w.arm();
					break;
				case 5:
					System.out.println("Terminated");
					System.exit(0);
					break;
				default:
					System.out.println("WRONG CHOICE");
					break;

				}
				sc.nextByte();
			} catch (Exception ex) {
				System.err.println(ex);
			}
		}

	}
}
<<<<<<< HEAD
=======
//hello how r u?
>>>>>>> 35f8ff1a01c3464f435a9843e8f60327621eea08
