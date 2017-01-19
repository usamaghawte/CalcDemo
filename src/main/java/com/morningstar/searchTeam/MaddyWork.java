package com.morningstar.searchTeam;

import com.morningstar.searchTeam.api.MaddyWorkApi;

public class MaddyWork implements MaddyWorkApi {

	public boolean palindrome(String data) {
		StringBuffer buffer = new StringBuffer(data);
		buffer.reverse();
		String data2 = buffer.toString();
		if (data.equalsIgnoreCase(data2)) {
			return true;
		}
		return false;
	}

	public void fibonnaciS(int num1, int num2) {
		System.out.println("Fibonacci Series : " + num1 + " , " + num2);
		for (int i = 0; i < 10; i++) {
			num2 += num1;
			num1 = num2 - num1;
			System.out.print(" , " + num2);
		}
	}

}
