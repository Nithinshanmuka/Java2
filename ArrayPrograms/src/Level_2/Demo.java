package Level_2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swaping a= " +a+" b= "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swaping a= "+a+ " b= "+b);
		
	}

}
