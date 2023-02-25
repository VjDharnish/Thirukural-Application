package com.dharun.thirukkuralapp.thirukuralbynumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.parser.JSONParser;

import com.dharun.thirukuralapp.dto.Thirukural;
import com.dharun.thirukuralapp.repository.ThirukuralRepo;

public class NumberSearchModel implements NumberSearchModelCallBack {
	private NumberSearchControllerModelCallBack numberSearchController;
	public NumberSearchModel(NumberSearchControllerModelCallBack numberSearchController) {
		this.numberSearchController =numberSearchController;
		
	}
	@Override
	public void getKural(int number,String author) {
		Thirukural thirukural = ThirukuralRepo.getInstance().getThirukural(number,author);
		numberSearchController.showThirukural(thirukural);
	}

}