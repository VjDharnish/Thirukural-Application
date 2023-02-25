package com.dharun.thirukuralapp.file;

import java.util.Scanner;

public class FileController implements FileControllerCallBack,FileControllerModelCallBack {
	private FileViewCallBack fileView;
	private FileModelCallBack fileModel;
	public FileController(FileViewCallBack fileView) {
	this.fileView = fileView;
	this.fileModel = new FileModel(this);// TODO Auto-generated constructor stub
	}
	@Override
	public void getHistory() {
		Scanner history = fileModel.getHistory();
		if(history == null)
			fileView.error("File Not Found");
		else
			fileView.showHistory(history);
	}
	@Override
	public void getSpecality() {
		Scanner speciality = fileModel.getSpeciality();
		if(speciality == null)
			fileView.error("File Not Found");
		else
			fileView.showHistory(speciality);
	}

}
