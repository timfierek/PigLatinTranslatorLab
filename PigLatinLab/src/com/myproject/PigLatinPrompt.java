package com.myproject;

import java.util.Scanner;

/**
 * PigLatinPrompt uses the translate() method from PigLatin.java
 * to take in user input from the console and then translates it
 * to Pig Latin
 * 
 * @author Tim Fierek
 *
 */
public class PigLatinPrompt {

	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println(" Welcome to Tim's Pig Latin Translator!\n"
				+ " ======================================");
		
		boolean loop = true;
		
		while(loop) {
			promptInput();
			String word = in.nextLine();
			printTranslation(word, PigLatin.translate(word));
			loop = promptContinue();
		}
		
		System.out.println("\n Thank you for using this translator, goodbye.");
		
		in.close();
		
	}
	
	private static void promptInput() {
		System.out.print("\n Enter the word or phrase you would like translated: ");
	}
	
	private static boolean promptContinue() {
		System.out.print("\n Would you like to translate more? (\"y\" or \"n\"): ");
		String input = in.nextLine().toLowerCase();
		while(!input.equals("y") && !input.equals("n")) {
			System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
			input = in.nextLine().toLowerCase();
		}
		if(input.equals("y")) {
			return true;
		}
		return false;
	}
	
	private static void printTranslation(String orig, String trans) {
		System.out.printf("%n%13s%s%n", "Original: ", orig);
		System.out.printf("%13s%s%n", "Translated: ", trans);
	}

}
