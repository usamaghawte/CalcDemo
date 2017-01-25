package com.morningstar.searchTeam;
import com.morningstar.api.MaddyWorkApi;;

public class MaddyWork implements MaddyWorkApi {
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
	public String fibonnaciS(int num1, int num2) {
		int a=num1;
		int b=num2;
		String ans="Fibonacci Series : " + num1 + " , " + num2;
		StringBuilder bldg=new StringBuilder(ans);
		for (int i = 0; i < 10; i++) {
			b += a;
			a = b - a;
			bldg.append(" , " + b);
		}
		ans=bldg.toString();
		return ans;
	}
}
