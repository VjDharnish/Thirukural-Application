package com.dharun.thirukkuralapp.thirukuralbyadhigaram;

public interface AdhigaramViewCallBack {

	void invalidOption(String string);

	void adhigaramOption();

	void backHome();

	void showException(String exception);

	void showKurals(String adhigaram, Long[] number, String[] line1, String[] line2, String[] tamilExplanation,
			String[] translation, String[] englishExplanation);

}
