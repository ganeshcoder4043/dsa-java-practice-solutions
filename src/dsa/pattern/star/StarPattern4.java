package dsa.pattern.star;

public class StarPattern4 {
	public static void main(String[] args) {
		System.out.println("StarPattern4");
		for(int i=1;i<=5;i++) {
			for(int s=i;s<=5;s++) {   // for space print   <--
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//StarPattern4
//    *
//   **
//  ***
// ****
//*****

