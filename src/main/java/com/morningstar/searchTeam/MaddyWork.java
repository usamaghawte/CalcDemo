package com.morningstar.searchTeam;


public class MaddyWork implements com.morningstar.searchTeam.api.MaddyWorkApi {
	@Override
	public boolean palindrome(String data) {
		StringBuilder buildVar = new StringBuilder(data);
		buildVar.reverse();
		String data2 = buildVar.toString();
		if (data.equalsIgnoreCase(data2)) {
			return true;
		}
		return false;
	}
	@Override
	public void fibonnaciS(int num1, int num2) {
		System.out.println("Fibonacci Series : " + num1 + " , " + num2);
		for (int i = 0; i < 10; i++) {
			num2 += num1;
			num1 = num2 - num1;
			System.out.print(" , " + num2);
		}
	}
}
