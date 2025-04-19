package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.println("Tamilnadu: South India");
	}
	
	private void northIndia() {
		System.out.println("Delhi: North India");
	}
	
	public static void main(String[] args) {
		
		LanguageInfo language = new LanguageInfo();
		
		language.tamilLanguage();
		language.englishLanguage();
		language.hindiLanguage();
		
		StateDetails state = new StateDetails();
		
		state.southIndia();
		state.northIndia();
		
	}

}
