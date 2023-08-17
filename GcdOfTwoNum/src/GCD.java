import java.util.Scanner;

 
class GCDApp{
	
	int findGCD(int m,int n)
	{
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		int gcd=m;
		return gcd;
	}

}


 class GCD {
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num");
		int m=sc.nextInt();
		int n=sc.nextInt();
		GCDApp gcd=new GCDApp();
		int res =gcd.findGCD(m, n);
		System.out.println("GCD of " +m +" & "+n +" is "+res);
	 }

}
