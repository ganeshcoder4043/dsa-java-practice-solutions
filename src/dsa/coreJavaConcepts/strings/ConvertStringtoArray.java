package dsa.coreJavaConcepts.strings;

public class ConvertStringtoArray {

	public static void main(String[] args) {
		
		// 1. Convert String to Character Array
        String str = "Hello World!";
        char[] charArray = str.toCharArray();
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // 2. Convert String to String Array (split by space)
        String sentence = "Java is awesome";
        String[] wordArray = sentence.split(" ");
        System.out.println("\n\nWord Array (split by space):");
        for (String word : wordArray) {
            System.out.println(word);
        }

        // 3. Convert String to String Array (split by comma)
        String csv = "apple,banana,cherry,date";
        String[] fruitArray = csv.split(",");
        System.out.println("\nFruit Array (split by comma):");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 4. Convert String to Byte Array
        byte[] byteArray = str.getBytes();
        System.out.println("\nByte Array:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
	}
}
