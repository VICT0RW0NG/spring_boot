package com.aswatson.pogc;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Product {
	
	
	protected String item;
	
	
	protected String soh;
	
	
	protected String inTransitQty;

	
	protected String reservedQty;
	
	
	protected String availableQty;
	
	
	protected String openingDate;
	
	
	@JsonGetter("Item")
	public String getItem() {
		return item;
	}

	@JsonSetter("Item")
	public void setItem(String item) {
		this.item = item;
	}

	public String getSoh() {
		return soh;
	}
	
	@JsonSetter("SOH")
	public void setSoh(String soh) {
		this.soh = soh;
	}

	public String getInTransitQty() {
		return inTransitQty;
	}

	@JsonSetter("InTransitQty")
	public void setInTransitQty(String inTransitQty) {
		this.inTransitQty = inTransitQty;
	}

	public String getReservedQty() {
		return reservedQty;
	}

	@JsonSetter("ReservedQty")
	public void setReservedQty(String reservedQty) {
		this.reservedQty = reservedQty;
	}

	public String getAvailableQty() {
		return availableQty;
	}
	
	@JsonSetter("AvailableQty")
	public void setAvailableQty(String availableQty) {
		this.availableQty = availableQty;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	@JsonSetter("OpeningDate")
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	
	
}
