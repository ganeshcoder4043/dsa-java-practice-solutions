package dsa.pattern.number;

public class NumberPattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
