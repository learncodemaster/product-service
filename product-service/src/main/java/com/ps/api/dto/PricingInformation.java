package com.ps.api.dto;

public class PricingInformation{
    public int currentPrice;
    public int standard_price;
    public double standard_price_no_vat;
    public double sale_price;
	public int getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	public int getStandard_price() {
		return standard_price;
	}
	public void setStandard_price(int standard_price) {
		this.standard_price = standard_price;
	}
	public double getStandard_price_no_vat() {
		return standard_price_no_vat;
	}
	public void setStandard_price_no_vat(double standard_price_no_vat) {
		this.standard_price_no_vat = standard_price_no_vat;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
    
    
}
