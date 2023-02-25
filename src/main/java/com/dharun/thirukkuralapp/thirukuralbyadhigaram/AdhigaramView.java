package com.dharun.thirukkuralapp.thirukuralbyadhigaram;

import java.util.Scanner;

import com.dharun.thirukuralapp.main.ThirukuralView;

public class AdhigaramView implements AdhigaramViewCallBack {
	private AdhigaramControllerViewCallBack adhigaramController;
	private Scanner scanner = new Scanner(System.in);
	private ThirukuralView thirukuralView;

	public AdhigaramView(ThirukuralView thirukuralView) {
		this.thirukuralView = thirukuralView;
		this.adhigaramController = new AdhigaramController(this);
	}

	public void adhigaramOption() {
		System.out.println("அதிகாரம் வாரியான தேடலை தேர்ந்தெடுத்துள்ளீர்கள்");
		System.out.println("அதிகாரம் எண்ணை(1-133) உள்ளிடவும்");
		String option = scanner.next();
		adhigaramController.findAdhigaram(option);
		
	}

	@Override
	public void invalidOption(String invalidNumber) {
		System.out.println(invalidNumber);
		adhigaramOption();
		
	}
	public void showKurals(String adhigaram,Long[] number, String[] line1, String[] line2, String[] tamilExplanation,
			String[] translation, String[] englishExplanation) {
		System.out.println("        >> "+adhigaram+" <<       ");
		System.out.println("----------------------------------------------");
		for(int start =0;start<10;start++) {
			System.out.println("குறள் எண் "+number[start]);
			System.out.println("----------------------------------------------");
			System.out.println(" "+line1[start]);
			System.out.println(" "+line2[start]);
			System.out.println("----------------------------------------------");
			System.out.println("தமிழ் விளக்கம்: "+tamilExplanation[start]);
			System.out.println("\nEnglish Translation: "+translation[start]);
			System.out.println(englishExplanation[start]+"\n");
			start++;
		}
		System.out.println("வேறு குறளில் தேட வேண்டுமா? (1=ஆம்/2=இல்லை)");
		char option = scanner.next().charAt(0);
		adhigaramController.decideOption(option);
	}

	@Override
	public void backHome() {
		thirukuralView.home();
		
	}

	@Override
	public void showException(String exception) {
		System.out.println(exception);
		System.exit(0);
		
	}

}
