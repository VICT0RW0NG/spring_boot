package com.aswatson.pogc.request;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonGetter;

public class RealTimeStockRequest {

	protected String bu;
	
	protected String storeNo;
	
	protected String requestedTime;
	
	protected String[] items;
	
	@JsonGetter("BU")
	public String getBu() {
		return bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}
	
	@JsonGetter("StoreNo")
	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	@JsonGetter("RequestedTime")
	public String getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}
	
	@JsonGetter("Items")
	public String[] getItems() {
		return items;
	}
	
	public void setItems(String[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "RealTimeStockRequest [bu=" + bu + ", storeNo=" + storeNo + ", requestedTime=" + requestedTime
				+ ", items=" + Arrays.toString(items) + ", getBu()=" + getBu() + ", getStoreNo()=" + getStoreNo()
				+ ", getRequestedTime()=" + getRequestedTime() + ", getItems()=" + Arrays.toString(getItems())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
