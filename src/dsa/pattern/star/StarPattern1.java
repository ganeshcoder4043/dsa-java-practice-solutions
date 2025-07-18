package dsa.pattern.star;


public class StarPattern1 {
	public static void main(String[] args) {
		System.out.println("NumberPattern1");
		for(int i=1;i<=5;i++) {          // Outer loop → Rows
			for(int j=1;j<=5;j++) {      // Inner loop → Columns
				System.out.print("*");   // Print star in one line
			}
			System.out.println();        // Move to next line after one row
		}
	}
}

//NumberPattern1
//*****
//*****
//*****
//*****
//*****



//  i = 1 → j = 1 2 3 4 5 → print 5 stars → new line
//  i = 2 → j = 1 2 3 4 5 → print 5 stars → new line
//  ...
//  i = 5 → j = 1 2 3 4 5 → print 5 stars → new line
