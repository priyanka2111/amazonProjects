package com.myorg.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductDetailsPage extends WebDriverBaseTestPage<WebDriverTestPage> {


	@FindBy(locator ="spn.producttitle.productdetailspage")
		private QAFWebElement spnProductTitleProductDetailsPage;
	
	@FindBy(locator ="spn.productprice.productdetailspage")
	private QAFWebElement spnProductPriceProductDetailsPage;

	@FindBy(locator ="btn.addtocart.productdetailspage")
	private QAFWebElement btnAddtocartProductDetailsPage;

	@Override
	public void waitForPageToLoad(){
		spnProductTitleProductDetailsPage.waitForNotPresent();
		spnProductPriceProductDetailsPage.waitForPresent();
		}
	
	
	
	public QAFWebElement getSpnProductTitleProductDetailsPage() {
		return spnProductTitleProductDetailsPage;
	}



	public QAFWebElement getSpnProductPriceProductDetailsPage() {
		return spnProductPriceProductDetailsPage;
	}



	public QAFWebElement getBtnAddtocartProductDetailsPage() {
		return btnAddtocartProductDetailsPage;
	}

	public void addproductToCart(){
		btnAddtocartProductDetailsPage.click();
	}


	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}
