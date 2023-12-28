package org.emp;

import java.io.IOException;

import org.lib.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.page1.LoginPage;

public class Sample {

	public static void main(String[] args) throws IOException {

		LibGlobal global = new LibGlobal();

		 global.launchBroswer("edge");
		global.loadUrl("https://www.facebook.com/");

		LoginPage loginPage = new LoginPage();

		global.setText(loginPage.getTextUserName(), global
				.getData("C:\\Users\\Lenovo\\eclipse-workspace\\Baseclass\\Excel\\Exel data.xlsx", "Sheet1", 1, 0));

		global.setText(loginPage.getTxtPassword(), global
				.getData("C:\\Users\\Lenovo\\eclipse-workspace\\Baseclass\\Excel\\Exel data.xlsx", "Sheet1", 1, 1));

		global.btnClick(loginPage.getBtnLogin());

	}

}
