package factor;

import java.util.Scanner;

public class FactorialofNum {
public static void main(String[] args) {
	System.out.println("enter a N");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int factor=1;
	for(int i=1;i<=n;i++) {
		factor=factor*i;
		
	}
	System.out.println(factor);
	
	
}
}
