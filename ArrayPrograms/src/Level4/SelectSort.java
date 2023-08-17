package Level4;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements");
		
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
				
			}
		}
		
				

		// TODO Auto-generated method stub

	}

}
