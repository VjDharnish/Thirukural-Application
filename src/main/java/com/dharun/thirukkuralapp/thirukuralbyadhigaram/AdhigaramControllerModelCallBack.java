package com.dharun.thirukkuralapp.thirukuralbyadhigaram;

import java.util.List;

import com.dharun.thirukuralapp.dto.Thirukural;

public interface AdhigaramControllerModelCallBack {

	void showException(String string);

	void showKurals(String adhigaram, List<Thirukural> kurals);


}
