package com.myorg.components;

import com.myorg.beans.ProductBean;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CartItem extends QAFWebComponent {
	
	@FindBy(locator ="span.prodname.shoppingcartpage")
	private QAFWebElement spanProdName;
	
	@FindBy(locator ="para.price.shoppingcartpage")
	private QAFWebElement paraPrice;
	
	
		
	public QAFWebElement getSpanProdName() {
		return spanProdName;
	}


	public QAFWebElement getParaPrice() {
		return paraPrice;
	}
	public CartItem(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean equals(Object obj){
		if(null != obj && obj instanceof String){
			return spanProdName.getTagName().equalsIgnoreCase((String) obj);
		}
		if(null != obj && obj instanceof String){
			ProductBean prod =(ProductBean)obj;
			return spanProdName.getTagName().equalsIgnoreCase(prod.getName()) 
					&& paraPrice.getText().contains(prod.getPrice());	
			}
		return false;
	}


	
}
