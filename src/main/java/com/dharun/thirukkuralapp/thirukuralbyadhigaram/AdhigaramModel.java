package com.dharun.thirukkuralapp.thirukuralbyadhigaram;

import java.util.List;

import com.dharun.thirukuralapp.dto.Thirukural;
import com.dharun.thirukuralapp.repository.ThirukuralRepo;

public class AdhigaramModel implements AdhigaramModelCallBack {
	private AdhigaramControllerModelCallBack adhigaramController;
	public AdhigaramModel(AdhigaramControllerModelCallBack adhigaramController) {
		this.adhigaramController =adhigaramController;
	}
	@Override
	public void getAdhigaram(int number) {
		List arr  = ThirukuralRepo.getInstance().getAdhigaram(number); 
		if(arr.size() ==0) {
			adhigaramController.showException("File Not Found");
		}
		else {
			String adhigaram  = (String) arr.get(0);
			long start = ((long)arr.get(1))-1;
			List<Thirukural> kurals =  ThirukuralRepo.getInstance().getAdhigaramKural(start);
			if(kurals.size() == 0) {
				adhigaramController.showException("File Not Found");
			}
			else {
				adhigaramController.showKurals(adhigaram,kurals);
			}
		}
		
		
	}

}
