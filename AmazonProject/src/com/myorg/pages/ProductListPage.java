package com.myorg.pages;

import java.util.List;

import com.myorg.beans.ProductBean;
import com.myorg.components.ProductListItem;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class ProductListPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	

	@FindBy(locator ="list.product.productListPage")
		private List<ProductListItem> listProduct;
	
	@FindBy(locator ="sdd.sortproduct.productListPage")
	private QAFWebElement sddSortProduct;
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void waitForPageToLoad(){
		sddSortProduct.waitForPresent();
		
	}
	
	public ProductBean selectProductByIndex(int index){
		ProductListItem prodItem =listProduct.get(index);
		String name =prodItem.getHdrProductname().getText();
	//	String seller=prodItem.getLblSellername().getText();
		String price=prodItem.getLblProductPrice().getText();
		ProductBean productToSelect = new ProductBean(name, price);
		prodItem.getHdrProductname().click();
		return productToSelect;
	}
	
	
	public ProductBean selectProductByName(String productName){
		for(ProductListItem prod : listProduct){
			if(prod.equals(productName)){
				String name =prod.getHdrProductname().getText();
			//	String seller=prod.getLblSellername().getText();
				String price=prod.getLblProductPrice().getText();
				ProductBean productToSelect = new ProductBean(name, price);
				prod.getHdrProductname().click();
				return productToSelect;
			}
		}
		Reporter.log(productName+"not found",MessageTypes.Fail);
		return null;
	
		
	}
}
