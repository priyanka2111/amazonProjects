package com.myorg.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductListItem extends QAFWebComponent{
	

	@FindBy(locator ="img.frontimg.productListPage")
		private QAFWebElement imgFront;
	
	@FindBy(locator ="hdr.productname.productListPage")
	private QAFWebElement hdrProductname;
	
	@FindBy(locator ="lbl.sellername.productListPag")
	private QAFWebElement lblSellername;
	
	@FindBy(locator ="lbl.productprice.productListPage")
	private QAFWebElement lblProductPrice;

	public ProductListItem(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	
	
	public QAFWebElement getImgFront() {
		return imgFront;
	}



	public QAFWebElement getHdrProductname() {
		return hdrProductname;
	}



	public QAFWebElement getLblSellername() {
		return lblSellername;
	}



	public QAFWebElement getLblProductPrice() {
		return lblProductPrice;
	}



	@Override
	public boolean equals(Object obj){
		if(null != obj && obj instanceof String){
			return hdrProductname.getTagName().equalsIgnoreCase((String) obj);
		}
		return super.equals(obj);
	}
}
