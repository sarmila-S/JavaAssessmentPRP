//return sum of last digits of given 2 numbers
package day3;

import java.util.Scanner;

public class Sumoflastdigits {
public static int sumDigits(int a,int b)
{
	if(a<0)
		a*=-1;
	if(b<0)
		b*=-1;
	int res=(a%10)+(b%10);
	return res;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(sumDigits(a,b));
	}

}
