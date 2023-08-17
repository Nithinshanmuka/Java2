package patternAlphabet;

public class Pattern1 {
	public static void main(String[] args) {
		char ch='A';
		char dh ='B';
		for(int i=1;i<=5;i++) {
			System.out.print(ch);
			for(int j=1;j<=i;j++) {
				System.out.print(dh);
			}
			System.out.println();
			dh++;
		}
		
	}

}
