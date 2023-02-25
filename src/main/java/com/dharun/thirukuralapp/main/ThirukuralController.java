package com.dharun.thirukuralapp.main;


public class ThirukuralController implements ThirukuralControllerViewCallBack,ThirukuralControllerModelCallBack {

	private ThirukuralViewCallBack thirukuralView;
	private ThirukuralModelCallBack thirukuralModel;

	public ThirukuralController(ThirukuralViewCallBack thirukuralView) {
		this.thirukuralView= thirukuralView;
		this.thirukuralModel= new ThirukuralModel(this);
	}

	@Override
	public void homeOptions(char option) {
		switch(option) {
		case '1':
			thirukuralView.getThirukuralByNumber();
			break;
		case '2':
			thirukuralView.getThirukuralByAdhigaram();
			break;
		case '3':
			thirukuralView.getThirukuralHistory();
			break;
		case '4':
			thirukuralView.getThirukuralSpecialities();
			break;
		case '0':
			thirukuralView.exit();
			break;
		default:
			thirukuralView.invalidOption();
			break;
		}
		
	}

}
