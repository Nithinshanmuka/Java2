package Level_2;

public class memo {
	public static void main(String[] args) {
		int num[] []= new int  [3][4];
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				num[i][j]=(int)(Math.random()*10);
				
			}
		}
		for(int n[]:num)
		{
			for(int m:n)
			{
				System.out.print(m+ " ");
			}
			System.out.println();
		}
		
	}

}
