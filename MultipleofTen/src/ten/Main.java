package ten;

import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n)
	{
		if (n%10==0) {
			System.out.println("number ismultiple of 10");
		}
		else
		{
			System.out.println("it is not multiple of 10");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkMultipleOfTen(n);
	}

}
