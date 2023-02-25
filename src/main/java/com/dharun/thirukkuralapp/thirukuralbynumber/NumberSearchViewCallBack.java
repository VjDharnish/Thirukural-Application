package com.dharun.thirukkuralapp.thirukuralbynumber;

public interface NumberSearchViewCallBack {

	void invalidOption(String string);

	void getAuthor(int number);

	void invalidAuthor(int number, String invalidAuthor);

	void raisedException(String string);

	void showKural(long l, String line1, String line2, String tamilExplanation, String transliteration,
			String englishExplanation);

	void numberSearch();

	void backHome();

}
