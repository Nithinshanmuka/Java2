package Level3;

import java.util.Scanner;

public class SumApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array 1 ");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the length of array 2 ");
		int arr2[]=new int[sc.nextInt()];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
		Sum ob=new Sum();
		int res[]=ob.sumArray(arr1, arr2);
		System.out.println("sum of the 2 array are");
		for (int x:res)
		{
			System.out.println(x+" ");
		}
		
	}

}
