package com.myproject.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.myproject.PigLatin;

class PigLatinTest {

	@Test
	void testVowels1() {
		assertEquals("octagonway", PigLatin.translate("octagon"));
	}
	
	@Test
	void testVowels2() {
		assertEquals("aceway", PigLatin.translate("ace"));
	}
	
	@Test
	void testVowels3() {
		assertEquals("eagleway", PigLatin.translate("eagle"));
	}
	
	@Test
	void testVowels4() {
		assertEquals("indigoway", PigLatin.translate("indigo"));
	}
	
	@Test
	void testVowels5() {
		assertEquals("uncleway", PigLatin.translate("uncle"));
	}
	
	@Test
	void testSingleConsonant() {
		assertEquals("ainpay", PigLatin.translate("pain"));
		assertEquals("urntay", PigLatin.translate("turn"));
	}
	
	@Test
	void testDoubleConsonant() {
		assertEquals("owledgeknay", PigLatin.translate("knowledge"));
	}
	
	@Test
	void testTripleConsonant() {
		assertEquals("oolschay", PigLatin.translate("school"));
	}
	
	@Test
	void testLowerCase() {
		assertEquals("ellohay", PigLatin.translate("HeLlO"));
	}
	
	@Test
	void testUpperCase() {
		assertEquals("HeLlO@@", PigLatin.translate("HeLlO@@"));
	}
	
	@Test
	void testContraction() {
		assertEquals("an'tcay", PigLatin.translate("can't"));
	}
	
	@Test
	void testEntirePhrase() {
		assertEquals("anslatetray away olewhay asephray", PigLatin.translate("translate a whole phrase"));
	}

}
