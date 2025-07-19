package dsa.pattern.character;

public class CharPattern6 {

	public static void main(String[] args) {
		for(char i='a';i<='e';i++) {
			for(char j='a';j<='e';j++) {
				if(i=='a' || i=='e' || j=='a' || j=='e') {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}

	}

}
