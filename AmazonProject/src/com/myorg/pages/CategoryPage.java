package com.myorg.pages;



import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CategoryPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy(locator ="img.subcategory.categoryPage")
	private QAFWebElement imgSubCategory;
	
	
		
	public QAFWebElement getImgSubCategory() {
		return imgSubCategory;
	}


	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void openSubCategoryPage(String subCategory){
		QAFExtendedWebElement subCategoryLink = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("img.subcategory.categoryPage"), subCategory));
		subCategoryLink.click();
	}
	
	}

	
	
