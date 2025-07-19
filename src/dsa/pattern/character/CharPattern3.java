package dsa.pattern.character;

public class CharPattern3 {

	public static void main(String[] args) {
		for (char i = 'a'; i <= 'e'; i++) {
			for (char j = 'e'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

//edcba
//edcb
//edc
//ed
//e