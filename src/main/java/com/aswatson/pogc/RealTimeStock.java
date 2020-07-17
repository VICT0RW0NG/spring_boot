package com.aswatson.pogc;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RealTimeStock {

	protected String bu;
	
	protected String storeNo;
	
	protected String requestedTime;
	
	protected String[] items;
	
	protected Product[] products;
	
	protected String responseCode;
	
	protected String responseMsg;
	
	public String getResponseCode() {
		return responseCode;
	}

	@JsonSetter("ResponseCode")
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	@JsonGetter("ResponseMsg")
	public String getResponseMsg() {
		return responseMsg;
	}

	@JsonSetter("ResponseMsg")
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	@JsonGetter("BU")
	public String getBu() {
		return bu;
	}

	@JsonSetter("BU")
	public void setBu(String bu) {
		this.bu = bu;
	}
	
	@JsonGetter("StoreNo")
	public String getStoreNo() {
		return storeNo;
	}

	@JsonSetter("StoreNo")
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	@JsonGetter("Products")
	public Product[] getProducts() {
		return products;
	}
	
	@JsonSetter("Products")
	public void setProducts(Product[] products) {
		this.products = products;
	}

	@JsonGetter("RequestedTime")
	public String getRequestedTime() {
		return requestedTime;
	}

	@JsonSetter("RequestedTime")
	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}
	
	@JsonGetter("Items")
	public String[] getItems() {
		return items;
	}
	
	@JsonSetter("Items")
	public void setItems(String[] items) {
		this.items = items;
	}

	
}
