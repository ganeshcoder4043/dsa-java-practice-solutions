package dsa.pattern.star;

public class StarPattern3 {

	public static void main(String[] args) {
		System.out.println("StarPattern3");
		for(int i=1;i<=5;i++) {                //row
			for(int j=5;j>=i;j--) {             //column
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//StarPattern3
//*****
//****
//***
//**
//*