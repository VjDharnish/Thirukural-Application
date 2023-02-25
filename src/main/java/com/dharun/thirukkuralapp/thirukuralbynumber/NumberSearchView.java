package com.dharun.thirukkuralapp.thirukuralbynumber;

import java.util.Scanner;

import com.dharun.thirukuralapp.main.ThirukuralView;
public class NumberSearchView implements NumberSearchViewCallBack{
	private NumberSearchControllerViewCallBack numberSearchController;
	private Scanner scanner = new Scanner(System.in);
	private ThirukuralView thirukuralView;
	public NumberSearchView(ThirukuralView thirukuralView){
		this.thirukuralView  =thirukuralView;
		this.numberSearchController= new NumberSearchController(this);
	}
	public void numberSearch() {
		System.out.println("குறள் எண்ணை தேர்வு செய்க (1-1330)");
		String num = scanner.next();
	
		System.out.println("உரையாசிரியரை தேர்வு செய்ய விருப்பமா 1. ஆம் / 2. இல்லை");
		char option = scanner.next().charAt(0);
		numberSearchController.numberSearch(num,option);	
	}
	@Override
	public void invalidOption(String invalidMessage) {
		System.out.println(invalidMessage);
		numberSearch();
	}
	@Override
	public void getAuthor(int number) {
		System.out.println("மு.வரதராசனார் உரைக்கு எண் 1ஐ அழுத்தவும்\r\n");
		System.out.println("பரிமேலழகர் உரைக்கு எண் 2ஐ அழுத்தவும்\r\n");
		System.out.println("மு. கருணாநிதி உரைக்கு எண் 3ஐ அழுத்தவும்\n");
		System.out.println("Enter the Choice: ");
		char authorOption = scanner.next().charAt(0);
		numberSearchController.getKural(number,authorOption);
		
	}
	@Override
	public void invalidAuthor(int number,String invalidAuthor) {
		System.out.println(invalidAuthor);
		getAuthor(number);
		
	}
	@Override
	public void raisedException(String exception) {
		System.out.println(exception);
		thirukuralView.home();
		
	}
	public void showKural() {
		
	}
	@Override
	public void showKural(long number, String line1, String line2, String tamilExplanation, String transliteration,
			String englishExplanation) {
		System.out.println("குறள் எண் "+number);
		System.out.println("----------------------------------------------");
		System.out.println(" "+line1);
		System.out.println(" "+line2);
		System.out.println("----------------------------------------------");
		System.out.println("தமிழ் விளக்கம்: "+tamilExplanation);
		System.out.println("\nEnglish Translation: "+transliteration);
		System.out.println(englishExplanation);
		System.out.println("வேறு குறளில் தேட வேண்டுமா? (1=ஆம்/2=இல்லை)");
		char option = scanner.next().charAt(0);
		numberSearchController.yesNo(option);
		
	}
	@Override
	public void backHome() {
		thirukuralView.home();
		
	}
	
}
