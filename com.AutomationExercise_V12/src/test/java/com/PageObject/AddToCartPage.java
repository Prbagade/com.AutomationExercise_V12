package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage{

	
	public AddToCartPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[starts-with(@href,'/product_')]") WebElement img_ProdDetails;
	@FindBy(xpath = "//*[@class='cart_price']") WebElement selectedProdPrice;
	@FindBy(xpath = "//*[@class='disabled']") WebElement selectedProdQty;
	@FindBy(xpath = "//*[@class='cart_total_price']") WebElement selectedProdTotal;
	@FindBy(xpath = "//*[text()='Proceed To Checkout']") WebElement btn_ProdCheckOut;
	
	
	public void ClickOnProdDetails() 
	{
		System.out.println("Product is Details: "+img_ProdDetails.getText());
	}
	public void ClickOnProdPrice() 
	{
		System.out.println("Product Price: "+selectedProdPrice.getText());
	}
	public void ClickOnProdQty() 
	{
		System.out.println("Product Qty: "+selectedProdQty.getText());
	}
	public void ClickOnProdTotalprice() 
	{
		System.out.println("Product Total price: "+selectedProdTotal.getText());
	}
	
	
	public void ClickOnProdCheckOut() 
	{
		btn_ProdCheckOut.click();
	}
	
	
}
