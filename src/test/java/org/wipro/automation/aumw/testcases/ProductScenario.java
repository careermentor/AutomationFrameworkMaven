package org.wipro.automation.aumw.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.ProductPage;
import org.wipro.automation.aumw.utiltiesPkg.ReadPropFiles;

public class ProductScenario extends InitiateBrowser
{

	@Test
	public void validateprudctpage() throws Exception
	{
		//Validate you are in product page
		
		String ExpProductTitle = "Products";
		String ActProductTitle = driver.findElement(By.xpath(ReadPropFiles.readelement("product_productTitle_xpath"))).getText();
		Assert.assertEquals(ActProductTitle, ExpProductTitle);
		
		//validate all 6 products available in the product page
		
		//write the code - assignment
		
		
		//click on add to cart to product1
		ProductPage product = new ProductPage(driver);
		product.click_addtocartSauce_Labs_Backpack();
		
		//call the cart method from productpage
		
		
	}
	
}
