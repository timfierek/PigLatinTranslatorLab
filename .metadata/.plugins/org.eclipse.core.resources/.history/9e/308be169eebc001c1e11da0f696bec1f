
/**
 * 
 * @author Tim Fierek
 *
 */
public class PigLatin {

	public static void main(String[] args) {
		testPigLatin();
	}
	
	/**
	 * finds the first occurrence of a vowel in a word, excluding the vowel 'y'
	 * 
	 * @param word String to be checked for vowels
	 * @return first index of a vowel in word
	 */
	private static int firstVowel(String word) {
		if(!hasVowel(word)) {
			return -1;
		}
		
		int lowestIndex = Integer.MAX_VALUE;
		char[] letters = word.toCharArray();
		for(int i = 0; i < letters.length; i++) {
			if(i > lowestIndex) {
				break;
			}
			else if(letters[i]=='a' || letters[i]=='e' || letters[i]=='i' || letters[i]=='o' || letters[i]=='u'){
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	
	/**
	 * Determines if word has a vowel at any position within the String
	 * 
	 * @param word String to be evaluated
	 * @return true if word contains a vowel false if it does not
	 */
	private static boolean hasVowel(String word) {
		if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Converts a string into it's pig Latin equivalent
	 * 
	 * @param w String to be made into pig Latin
	 * @return a String that is w changed into pig Latin
	 */
	public static String translate(String w){
		String word = w.toLowerCase();
		int indexOfVowel = firstVowel(word);
		
		// For the very few words with no vowels or empty string
		if(indexOfVowel == -1) {
			return (word + "way");
		}
		else if(indexOfVowel == 0) {
			return (word + "way");
		}
		else {
			return (word.substring(indexOfVowel) + word.substring(0,indexOfVowel) + "ay");
		}		
	}
	
	private static void testPigLatin() {
		// Test with words starting with vowels
		System.out.println("===Tests for words that start with vowels===");
		System.out.println("translate(\"octagon\") Expected: octagonway --> Actual: " + translate("octagon"));
		System.out.println("translate(\"ace\") Expected: aceway --> Actual: " + translate("ace"));
		System.out.println("translate(\"eagle\") Expected: eagleway --> Actual: " + translate("eagle"));
		System.out.println("translate(\"indigo\") Expected: indigoway --> Actual: " + translate("indigo"));
		System.out.println("translate(\"uncle\") Expected: uncleway --> Actual: " + translate("uncle"));
		
		// Test with words starting with one consonant
		System.out.println("\n===Tests for words that start with one consonant===");
		System.out.println("translate(\"pain\") Expected: ainpay --> Actual: " + translate("pain"));
		System.out.println("translate(\"turn\") Expected: urntay --> Actual: " + translate("turn"));

		// Test with words starting with two consonant
		System.out.println("\n===Test for word that starts with two consonants===");
		System.out.println("translate(\"knowledge\") Expected: owledgeknay --> Actual: " + translate("knowledge"));
		
		// Test with words starting with three consonant
		System.out.println("\n===Test for word that starts with three consonants===");
		System.out.println("translate(\"school\") Expected: oolschay --> Actual: " + translate("school"));

		// Test for word that isn't lower case
		System.out.println("\n===Test for word isn't all lowercase===");
		System.out.println("translate(\"HeLlO\") Expected: ellohay --> Actual: " + translate("HeLlO"));
	}
	
	

}
