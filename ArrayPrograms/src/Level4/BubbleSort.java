package Level4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements");
		
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	Sort ob=new Sort();
	int res[]=ob.bubbleSort(arr);
	System.out.print("the ascending order of the array is  ");
	for(int x:res)
	{
		System.out.println(x+" ");
		
	}
	System.out.println("enter a key ");
  int y=sc.nextInt();
  
	Search o=new Search();
	int b=o.binary(res,y);
	if(b)
	
	}
	

}
