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
		System.out.println("Welcome  to Thirukural Application");
		System.out.println("--------------------------------------");
		System.out.println("Press 1 to search Thirukural by Number");
		System.out.println("Press 2 to search thirukural by Adhigaram");
		System.out.println("Press 3 to view Thirukural History");
		System.out.println("Press 4 to view Thirukural Specialities");
		System.out.println("Press 0 to exit ");
		System.out.println("Enter your Choice:");
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
		System.out.println("Thank You Visit Again ");
		
	}
	@Override
	public void invalidOption() {
		System.out.println("Invalid Option");
		home();
		
	}

}
