import java.util.Scanner;

public class Primenum {
	public static void main(String[] args) {
	
	int  n, count=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=3;i<=n;i++) {
	int res =checkPrime(i);
	if(res!=0) {
		System.out.println(res);
	count++;
	}
	
	}
	System.out.println("the count of prime number is"+ count);
	
}
	public static int checkPrime(int number)

	{

	for(int i=2;i<number;i++)

	{

	if(number%i==0)

	{

	return 0;

	}
	

	}

	return number;
	

	}
	

}
