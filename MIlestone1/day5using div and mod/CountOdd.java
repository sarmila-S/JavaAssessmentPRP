package day5;

import java.util.Scanner;

public class CountOdd {
	public static int oddsCount(int input1,int input2,int input3,int input4,int input5)
	{
		int count=0;
	    if(input1%2!=0)
	    count++;
	    if(input2%2!=0)
	    count++;
	    if(input3%2!=0)
	    count++;
	    if(input4%2!=0)
	    count++;
	    if(input5%2!=0)
	    count++;
	    //System.out.print(count);
	    return count;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			System.out.println(oddsCount(a,b,c,d,e));

		}

}
