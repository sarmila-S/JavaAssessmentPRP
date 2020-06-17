package day1;

import java.util.Scanner;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0)
			System.out.println("Zero");
		else if(num>0)
			System.out.println("Positive number");
		else
			System.out.println("Negative Number");

	}

}
