package discount;

import java.util.Scanner;

public class Main { 
	public static void checkDiscount(double purchaseAmount)
	{
	if(purchaseAmount>100)
	{
		System.out.println("Disount applicablel");
	}
	else
	{
		System.out.println("DIscount not Applicable");
	}
	}
public Main() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter purchase Amount");
	double purchaseAmount=scan.nextDouble();
	checkDiscount(purchaseAmount);
			
}

}



