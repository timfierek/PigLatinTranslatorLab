package com.myproject;

/**
 * 
 * @author Tim Fierek
 *
 */
public class PigLatin {
	
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
	 * Takes a string and removes anything except letters and the ' character
	 * 
	 * @param word string to be stripped of all punctuation, symbols, and numbers
	 * @return String without any 
	 */
	private static String stripPunctuation(String word) {
		char[] letters = (word.strip()).toCharArray();
		String result = "";
		for(int i = 0; i < letters.length; i++) {
			if(Character.isAlphabetic(letters[i]) || letters[i] == '\'') {
				result += Character.toString(letters[i]);
			}
		}
		
		return result.strip();
	}
	
	/**
	 * Helper method for translate() which determines if a string has a number
	 * or a symbol in it
	 * 
	 * @param word String to be examined
	 * @return true if the word has a number or a symbol in it (excluding punctuation)
	 */
	private static boolean hasNumOrSymbol(String word) {
		char[] letters = word.toCharArray();
		String symbols = "*@#$%^&*()\"{}[]|_\\/<>";
		for(char letter : letters) {
			if(Character.isDigit(letter)) {
				return true;
			}
			else if(symbols.contains(Character.toString(letter))) {
				return true;
			}
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
		
		String[] words = w.split(" ");
		String finalPhrase = "";

		for (String s : words) {

			if (hasNumOrSymbol(s)) {
				finalPhrase += (s + " ");
				continue;
			} 
			
			String word = stripPunctuation(s.toLowerCase());
			int indexOfVowel = firstVowel(word);
			
			if (indexOfVowel == -1) {
				finalPhrase += (word + "way" + " ");
			} else if (indexOfVowel == 0) {
				finalPhrase += (word + "way" + " ");
			} else {
				finalPhrase += (word.substring(indexOfVowel) + word.substring(0, indexOfVowel) + "ay" + " ");
			}
		}
		return finalPhrase.trim();
	}
	
}
