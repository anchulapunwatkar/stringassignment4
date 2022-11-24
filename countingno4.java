// Java Program to count vowels, consonant and
// special character in a given string
public class countingno4 {
	static void countCharacterType(String str)
	{
		// Declare the variable vowels, consonant
		// and special characters
		int vowels = 0, consonant = 0, specialChar = 0;
	
		// str.length() function to count number of
		// character in given string.
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
	
			if ( (ch >= 'a' && ch <= 'z') ||
				(ch >= 'A' && ch <= 'Z') ) {
	
				// To handle upper case letters
				ch = Character.toLowerCase(ch);
	
				if (ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u')
					vowels++;
				else
					consonant++;
			}
			else
				specialChar++;
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonant: " + consonant);
		System.out.println("Special Character: " + specialChar);
	}
	
	// Driver function.
	static public void main (String[] args)
	{
		String str = "You Are Unstopable12345";
		
		countCharacterType(str);
	}
}


