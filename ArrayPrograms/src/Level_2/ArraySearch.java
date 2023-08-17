package Level_2;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		System.out.println("Enter the length of the array");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the key element to search");
		int key=sc.nextInt();
		Search ob=new Search();
		boolean res=ob.isPresent(arr, key);
		if (res==true)
		{
			System.out.println("target found in an array");
		}
		else
		{
			System.out.println("target not found in anarray");
		}

		
	}

}
