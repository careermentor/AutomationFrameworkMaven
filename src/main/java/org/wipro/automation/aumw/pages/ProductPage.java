package org.wipro.automation.aumw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.aumw.utiltiesPkg.ReadPropFiles;

public class ProductPage 
{

	WebDriver driver;
	
	public ProductPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_addtocartSauce_Labs_Backpack() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("product1_name"))).click();
	}
	
	//create  a method for clicking on Cart
	
		
}
