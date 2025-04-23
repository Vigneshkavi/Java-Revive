package org.lang;

//Final Child Class

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("Tamil Language");
	}
	
	public void englishLanguage() {
		System.out.println("English Language");
	}
	
	public void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	
	public static void main(String[] args) {
		LanguageInfo info = new LanguageInfo();
		
		info.tamilLanguage();
		info.englishLanguage();
		info.hindiLanguage();
		info.southIndia();
		info.northIndia();
	}

}
