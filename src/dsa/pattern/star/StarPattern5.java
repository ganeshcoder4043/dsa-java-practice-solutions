package dsa.pattern.star;

public class StarPattern5 {
	public static void main(String[] args) {
		System.out.println("StarPattern4");
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//StarPattern4
//*****
// ****
//  ***
//   **
//    *
