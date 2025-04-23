package org.all;

//Final Child Class

import org.telugu.Telugu;

public class LanguageClass extends Telugu {
	private void allLanguage() {
		System.out.println("From All Language class");
	}
	
	public static void main(String[] args) {
		LanguageClass all = new LanguageClass();
		
		all.allLanguage();
		all.tamilLanguage();
		all.englishLanguage();
		all.teluguLanguage();
	}

}
