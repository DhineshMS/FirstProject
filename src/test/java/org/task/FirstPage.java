package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class FirstPage extends BaseClass {
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement enter;

	public WebElement getEnter() {
		return enter;
	}

	public void setEnter(WebElement enter) {
		this.enter = enter;
	}
}
