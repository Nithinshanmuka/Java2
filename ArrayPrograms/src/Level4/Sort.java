package Level4;

public class Sort {
	public int[] bubbleSort(int arr[]) {
		int i,j,temp;
		for (i=0;i<=arr.length-1;i++)
			
		{
			for(j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
