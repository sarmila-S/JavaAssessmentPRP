//if 6th parameter is odd print odd count else even count 
package day5;

import java.util.Scanner;

public class EvenorOdd {
	public static int oddoreven(int input1,int input2,int input3,int input4,int input5,String input6)
	
	{
		int count=0;
	    if(input1%2==0)
	    count++;
	    if(input2%2==0)
	    count++;
	    if(input3%2==0)
	    count++;
	    if(input4%2==0)
	    count++;
	    if(input5%2==0)
	    count++;
		int odd=5-count;
		if(input6.equals("odd"))
		return odd;
		else
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		String s=sc.next();
		System.out.println(oddoreven(a,b,c,d,e,s));

	}

}
