//return a second last digit of a given number
package day3;

import java.util.Scanner;

public class Secondlastdigit {

	public static int secondlastDigit(int n)
	{
		if(n<0)
			n*=-1;
		int res=(n/10)%10;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(secondlastDigit(n));
	}

}
