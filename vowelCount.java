//import scanner for input
import java.util.Scanner;

public class vowelCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String input = scanner.nextLine();

		int vowelCount = countVowels(input);

		System.out.println("Vowel Count: " + vowelCount);
	}

	public static int countVowels(String str) {
		int count = 0;
		//Convert to lowercase to handle both cases
		str = str.toLowerCase();
		//check each index of string
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count ++;
			}
		}
	return count;
	}

}
