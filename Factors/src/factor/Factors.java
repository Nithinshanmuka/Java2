package factor;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		int n;
		System.out.println("enter N");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
	}

}
