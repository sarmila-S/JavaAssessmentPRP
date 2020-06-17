package day5;

import java.util.Scanner;

public class NisMultipleofM {
public static int isMultiple(int input1,int input2)
{
	if(input1<0)
		input1*=-1;
	if(input1==0 || input2==0)
		return 3;
	if(input1%input2==0)
		return 2;
	else
		return 1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(isMultiple(a,b));
	}

}
