package com.dharun.thirukuralapp.main;
import java.util.Scanner;

import com.dharun.thirukkuralapp.thirukuralbyadhigaram.AdhigaramView;
import com.dharun.thirukkuralapp.thirukuralbynumber.NumberSearchView;
import com.dharun.thirukuralapp.file.FileView;
public class ThirukuralView implements ThirukuralViewCallBack {
	private ThirukuralControllerViewCallBack thirukuralController;
	
	private Scanner sc = new Scanner(System.in);
	public ThirukuralView(){
		this.thirukuralController= new ThirukuralController(this);
	}
	public static void main(String[] args) {
		ThirukuralView thirukuralView = new ThirukuralView();
		thirukuralView.home();
	}
	public void home() {
		System.out.println("\n**********திருக்குறள் செயலிக்கு உங்களை வரவேற்கிறோம்***********\n");	
		System.out.println("திருக்குறளை எண் வாரியாக தேட எண் ஒன்றை(1) அழுத்தவும்");
		System.out.println("திருக்குறளை அதிகாரம் வாரியாக தேட எண் இரண்டை(2) அழுத்தவும்");
		System.out.println("திருக்குறளின் சிறப்புகளை பற்றி அரிய எண் மூன்றை(3) அழுத்தவும்");
		System.out.println("திருக்குறளின் வரலாற்றை பற்றி அரிய எண் நான்கை (4) அழுத்தவும்");
		System.out.println("வெளியேற எண் ஐந்தை(5) அழுத்தவும்");
		char option = sc.next().charAt(0);
		thirukuralController.homeOptions(option);
		
	}
	@Override
	public void getThirukuralByNumber() {
		NumberSearchView thirukuralByNumber = new NumberSearchView(this);
		thirukuralByNumber.numberSearch();
	}
	@Override
	public void getThirukuralByAdhigaram() {
		AdhigaramView adhigaramView  = new AdhigaramView(this);
		adhigaramView.adhigaramOption();
		
		
	}
	@Override
	public void getThirukuralHistory() {
		FileView fileView = new FileView(this);
		fileView.getHistory();
		
	}
	@Override
	public void getThirukuralSpecialities() {
		FileView fileView = new FileView(this);
		fileView.getSpeciality();
		
	}
	@Override
	public void exit() {
		System.out.println("நன்றி");
		
	}
	@Override
	public void invalidOption() {
		System.out.println("தவறான விருப்பம்");
		home();
		
	}

}
