package com.myorg.pages;



import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage  extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator ="link.shopall.homepage")
		private QAFWebElement linkShopAll;
	
	@FindBy(locator ="link.cart.homepage")
	private QAFWebElement linkCart;
	
	
	public QAFWebElement getLinkShopAll() {
		return linkShopAll;
	}

	public QAFWebElement getLinkCart(){
		return linkCart;
	}
	
	public void openCategoryPage(String category){
		
			linkShopAll.click();
			QAFExtendedWebElement categoryLink = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("link.category.homepage"), category));
			categoryLink.click();
	}
	
	
	
	
	
	public void openShoppingCart(){
		linkCart.click();
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
		driver.manage().window().maximize();
		
	}
	public void launchPage()
	{
		openPage(null, null);
	}

}
