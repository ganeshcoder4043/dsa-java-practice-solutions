package dsa.pattern.character;

public class CharPattern5 {

	public static void main(String[] args) {
		for (char i = 'a'; i <= 'e'; i++) {
			for (char s = 'a'; s <= i; s++) {
				System.out.print(" ");
			}
			for (char j = i; j <= 'e'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
