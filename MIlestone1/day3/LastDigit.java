//return last digit of number as positive
package day3;

import java.util.Scanner;

public class LastDigit {

	public static int lastDigit(int n)
	{
		if(n<0)
			n*=-1;
		int res=n%10;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(lastDigit(n));
	}

}
