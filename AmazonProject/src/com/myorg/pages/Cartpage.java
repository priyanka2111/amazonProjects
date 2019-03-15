package com.myorg.pages;

import java.util.List;

import com.myorg.beans.ProductBean;
import com.myorg.components.CartItem;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class Cartpage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator ="div.listitem.shoppingcartpage")
	private List<CartItem> divListItem;

	@FindBy(locator ="btn.checkoutbtn.shoppingcartpage")
	private QAFWebElement btnCheckoutbtn;

	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void waitForPageToLoad(){
		btnCheckoutbtn.waitForPresent();
		}
	

	public List<CartItem> getDivListItem() {
		return divListItem;
	}

	public QAFWebElement getBtnCheckoutbtn() {
		return btnCheckoutbtn;
	}

	public boolean isProductInCart(String productname){
		for(CartItem prod:divListItem){
			if(prod.equals(productname)){
				return true;
			}
		}
		return false;
	}
	public boolean isProductInCart(ProductBean product){
		boolean found=false;
		Reporter.log("expected prod name"+product.getName() +"And Price"+product.getPrice());
		for(CartItem prod :divListItem){
			Reporter.log("actualproName" +prod.getSpanProdName().getText()+"actualProdPrice"
					+prod.getParaPrice().getText());
			if(prod.equals(product)){
				found=true;
			}	
		}
		return found;
	}
}
