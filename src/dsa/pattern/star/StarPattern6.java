package dsa.pattern.star;

public class StarPattern6 {

	public static void main(String[] args) {
		// between space
		System.out.println("StarPattern6-> between space");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}

}


//*****
//*   *
//*   *
//*   *
//*****