package com.myorg.beans;

public class ProductBean {
	String name;
	//String sellerName;
	String price;
	
	public ProductBean(String name,String price){
		this.name=name;
	//this.sellerName=sellerName;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}*/
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
