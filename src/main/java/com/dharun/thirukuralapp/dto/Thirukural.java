package com.dharun.thirukuralapp.dto;

import org.json.simple.JSONObject;

public class Thirukural {
	private long number;
	private String line1;
	private String line2;
	private String tamilExplanation;
	private String transliteration;
	private String englishExplanation;
	
	public Thirukural(JSONObject kuraljsonObject,String author){
		this.number = (long)kuraljsonObject.get("Number");
		this.line1 = (String)kuraljsonObject.get("Line1");
		this.line2 = (String)kuraljsonObject.get("Line2");
		this.tamilExplanation = (String)kuraljsonObject.get(author);
		this.transliteration = (String)kuraljsonObject.get("Translation");
		this.englishExplanation=(String)kuraljsonObject.get("explanation");
	}

	public String getTamilExplanation() {
		return tamilExplanation;
	}

	public void setTamilExplanation(String tamilExplanation) {
		this.tamilExplanation = tamilExplanation;
	}

	public long getNumber() {
		return number;
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getTransliteration() {
		return transliteration;
	}

	public String getEnglishExplanation() {
		return englishExplanation;
	}
	
	
}
