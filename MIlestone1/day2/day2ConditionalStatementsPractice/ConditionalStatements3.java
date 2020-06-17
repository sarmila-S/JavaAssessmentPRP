package day1;

import java.util.Scanner;

public class ConditionalStatements3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is EVEN NUMBER");
		else
			System.out.println(num+" is ODD NUMBER");

	}

}
