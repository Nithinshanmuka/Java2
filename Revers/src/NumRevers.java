import java.util.Scanner;

public class NumRevers {
	public static void main(String[] args) {
		Scanner sc=new Scanner ( System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ReversApp b=new ReversApp();
		int res=b.reverseNumber(n);
		System.out.println("revers number is "+ res);
		if (n==res) {
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not a palindrom");
		}
		
		
			
	

		}

}
