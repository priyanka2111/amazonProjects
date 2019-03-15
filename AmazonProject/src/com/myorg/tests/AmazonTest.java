	package com.myorg.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.myorg.beans.ProductBean;
import com.myorg.pages.Cartpage;
import com.myorg.pages.CategoryPage;
import com.myorg.pages.HomePage;
import com.myorg.pages.ProductDetailsPage;
import com.myorg.pages.ProductListPage;
import com.myorg.utilities.CommonUtils;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;



public class AmazonTest extends WebDriverTestCase {
	
	@Test
		public void addToCartTest(){
		HomePage home =new HomePage();
		home.launchPage();
		home.openCategoryPage("Televisions");
		
		CategoryPage catPage =new CategoryPage();
		catPage.openSubCategoryPage("Sony TVs");
		
		ProductListPage prodListPage=new ProductListPage();
		prodListPage.waitForPageToLoad();
		ProductBean selectedProduct = prodListPage.selectProductByIndex(0);
		
		
		CommonUtils.switchToWindow();
		ProductDetailsPage prodDetails =new ProductDetailsPage();
		prodDetails.waitForPageToLoad();
		//prodDetails.getSpnProductTitleProductDetailsPage().verifyText(selectedProduct.getName());
		prodDetails.addproductToCart();
		
		home.openShoppingCart();
		
		Cartpage cartPage= new Cartpage();
		cartPage.waitForPageToLoad();
		//Validator.verifyThat(cartPage.isProductInCart(selectedProduct), Matchers.equalTo(true));
	}

}
