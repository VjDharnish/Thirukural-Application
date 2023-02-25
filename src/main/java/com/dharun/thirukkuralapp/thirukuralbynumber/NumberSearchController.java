package com.dharun.thirukkuralapp.thirukuralbynumber;

import java.util.HashMap;

import com.dharun.thirukuralapp.dto.Thirukural;

public class NumberSearchController implements NumberSearchControllerViewCallBack,NumberSearchControllerModelCallBack {
	private NumberSearchViewCallBack numberSearchView;
	private  NumberSearchModelCallBack numberSearchModel;
	private HashMap<Character,String> authorMap = new HashMap<>();
	
	
	public NumberSearchController(NumberSearchViewCallBack numberSearchView) {
		this.numberSearchView = numberSearchView;
		this.numberSearchModel = new NumberSearchModel(this);
		authorMap.put('1',"mv");
		authorMap.put('2',"sp");
		authorMap.put('3',"mk");
		
	}
	@Override
	public void numberSearch(String num, char option) {
		try {
			int number = Integer.parseInt(num);
			if(number < 1 || number >1330) {
				throw new  NumberFormatException();
			}
			switch(option) {
			case '1':
				numberSearchView.getAuthor(number);
				break;
			case '2':
				numberSearchModel.getKural(number-1,"mv");
				break;
			default:
				numberSearchView.invalidOption("உங்கள் தேர்வு தவறானது. மீண்டும் தேர்வு செய்க");
				break;
			}
		}
		catch(NumberFormatException e) {
			numberSearchView.invalidOption("உங்கள் தேர்வு தவறானது. மீண்டும் தேர்வு செய்க");
		}
		
		
	}
	@Override
	public void getKural(int number, char authorOption) {
		if(authorOption =='1' ||authorOption =='2' ||authorOption =='3' ) {
			numberSearchModel.getKural(number-1,authorMap.get(authorOption));
		}
		else {
			numberSearchView.invalidAuthor(number,"உங்கள் தேர்வு தவறானது. மீண்டும் தேர்வு செய்க");
		}
		
	}
	@Override
	public void showThirukural(Thirukural thirukural) {
		if(thirukural == null) {
			numberSearchView.raisedException("Parse Exception");
		}
		
		numberSearchView.showKural(thirukural.getNumber(),thirukural.getLine1(),thirukural.getLine2(),thirukural.getTamilExplanation(),thirukural.getTransliteration(),thirukural.getEnglishExplanation());
		
	}
	@Override
	public void yesNo(char option) {
		if(option == '1')
			numberSearchView.numberSearch();
		else if(option == '2')
			numberSearchView.backHome();
		else 
			numberSearchView.invalidOption("உங்கள் தேர்வு தவறானது. மீண்டும் தேர்வு செய்க");
			
		
	}


}
