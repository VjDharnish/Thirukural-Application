package com.dharun.thirukuralapp.file;

import java.util.Scanner;

public interface FileViewCallBack {

	void showHistory(Scanner history);

	void error(String string);

}
