//if number is ODD return 2 or else return 1
package day3;

import java.util.Scanner;

public class Isodd {

	public static int isOdd(int n)
	{
		if(n<0)
			n*=-1;
		if(n%2==0)
			return 1;
		else
			return 2;
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isOdd(num));

		}


}
