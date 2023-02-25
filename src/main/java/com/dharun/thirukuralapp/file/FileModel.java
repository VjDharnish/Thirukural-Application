package com.dharun.thirukuralapp.file;
import java.util.Scanner;

import com.dharun.thirukuralapp.repository.ThirukuralRepo;
public class FileModel implements FileModelCallBack{

	private FileControllerModelCallBack fileController;

	public FileModel(FileControllerModelCallBack fileController) {
		this.fileController = fileController;
	}

	@Override
	public Scanner getHistory() {
		Scanner history = ThirukuralRepo.getInstance().getHistory();
		return history;
		
	}

	@Override
	public Scanner getSpeciality() {
		Scanner speciality = ThirukuralRepo.getInstance().getSpeciality();
		return speciality;
	}

}
