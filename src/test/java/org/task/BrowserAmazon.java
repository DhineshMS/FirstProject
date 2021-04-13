package org.task;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

public class BrowserAmazon extends BaseClass {
	public static void main(String[] args) {

		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("redmi mobiles");

		WebElement enter = driver.findElement(By.id("nav-search-submit-button"));
		enter.click();

		List<WebElement> red = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement x : red) {
			// System.out.println(x.getText());
		}
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (WebElement y : price) {
			System.out.println(y.getText());
		
	Set<Integer> d = new TreeSet<>();
	    String m = y.getText();
	    
	    m.replaceAll("[,]","");
		System.out.println(m);
		
		}
	}
}
