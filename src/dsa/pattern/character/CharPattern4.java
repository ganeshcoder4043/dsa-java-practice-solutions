package dsa.pattern.character;

public class CharPattern4 {

	public static void main(String[] args) {
		for (char i = 'a'; i <= 'e'; i++) {
			for (char s = i; s <= 'e'; s++) {
				System.out.print(" ");
			}
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
