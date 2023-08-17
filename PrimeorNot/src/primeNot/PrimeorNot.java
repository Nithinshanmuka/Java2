package primeNot;

import java.util.Scanner;

public class PrimeorNot {
public static void main(String[] args) {
	System.out.println("enter a num");
	int n,count=0;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count=count+1;
		}
	}
	if(count==2) {
		System.out.println("it is a prime");
	}
	else
		System.out.println("it is not prime");
}
}
