package com.morningstar.searchTeam;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App {
	static Scanner sc;
	static MaddyWork md;
	static usamaWork w;
	private App() {
		System.out.println("Calculator Application");
		sc=new Scanner(System.in);
		md=new MaddyWork();
		w=new usamaWork();
	}
	public static void main(String[] args) {
		boolean flag=true;
		while (flag) {
			try {
				System.out.println("********BASIC PROGRAMING*****");// NOPMD
				System.out.println(
						"\n 1:PRIME NUMBER \n 2:FIBONACCI SERIES \n 3:PALINDROME \n 4:ARMSTRONG NUMBER \n 5:Exit");// NOPMD
				System.out.println("  \nSelect your choice:");// NOPMD
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("@@@@@PRIME NUMBER@@@@@");// NOPMD
					w.prime();
					break;
				case 3:
					System.out.println("@@@@@ PALINDROME @@@@@");// NOPMD
					System.out.println("Enter Data to Check Palindrome");// NOPMD
					String palin = sc.nextLine().trim();
					if (md.palindrome(palin))
						System.out.println(palin + " is Palindrome");// NOPMD
					else
						System.out.println(palin + " is not a Palindrome");// NOPMD
					break;
				case 2:
					Fibbo();
					break;
				case 4:
					System.out.println("@@@@@ ARM STRONG NUMBER @@@@@");// NOPMD
					w.arm();
					break;
				case 5:
					System.out.println("Terminated");// NOPMD
					flag=false;
					break;
				default:
					System.out.println("WRONG CHOICE");// NOPMD
					break;

				}
				sc.nextByte();
			} catch (Exception ex) {
				System.err.println(ex);// NOPMD
				flag=false;
			}
		}

	}
	private static void Fibbo() {
		System.out.println("@@@@@ FIBONACCI SERIES @@@@@");// NOPMD
		System.out.println("Enter First Number of Fibonnaci Series");// NOPMD
		int f1 = sc.nextInt();
		System.out.println("Enter Second Number of Fibonnaci Series");// NOPMD
		int f2 = sc.nextInt();
		String ans=md.fibonnaciS(f1, f2);
		System.out.println(ans);
	}
}
// hello how r u?
