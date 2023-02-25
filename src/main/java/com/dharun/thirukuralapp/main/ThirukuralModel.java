package com.dharun.thirukuralapp.main;

public class ThirukuralModel  implements ThirukuralModelCallBack{

	private ThirukuralControllerModelCallBack thirukuralControlller;

	public ThirukuralModel(ThirukuralControllerModelCallBack thirukuralController) {
		this.thirukuralControlller = thirukuralController;
	}
	

}
