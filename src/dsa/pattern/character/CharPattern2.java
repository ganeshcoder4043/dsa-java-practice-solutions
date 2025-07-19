package dsa.pattern.character;

public class CharPattern2 {

	public static void main(String[] args) {
		for(char i='a';i<='e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}


	}

}

//a
//ab
//abc
//abcd
//abcde
