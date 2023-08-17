package Level_1;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int [sc.nextInt()];
	System.out.println("enter"+arr.length+"elementsto store in a array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("arr elements are");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
		
		
	}
}
}
