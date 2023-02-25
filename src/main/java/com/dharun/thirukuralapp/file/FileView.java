package com.dharun.thirukuralapp.file;

import java.util.Scanner;

import com.dharun.thirukuralapp.main.ThirukuralView;

public class FileView implements FileViewCallBack {
	private FileControllerCallBack fileController;
	private ThirukuralView thirukuralView;
	public FileView(ThirukuralView thirukuralView){
		this.fileController = new FileController(this);
		this.thirukuralView = thirukuralView;
	}
	public void getHistory() {
		fileController.getHistory();
	}
	public void getSpeciality() {
		fileController.getSpecality();
	}
	@Override
	public void showHistory(Scanner history) {
		while(history.hasNextLine()) {
			System.out.println(history.nextLine());
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		thirukuralView.home();
		
	}
	public void showSpeciality(Scanner speciality) {
		while(speciality.hasNextLine()) {
			System.out.println(speciality.nextLine());
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		thirukuralView.home();
		
	}
	
	@Override
	public void error(String nofile) {
		System.out.println(nofile);
		System.out.println();
		thirukuralView.home();
	}
}
