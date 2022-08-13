package com.ahmadsedighi.security.tls.resttls.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 13/08/2022
 * Time: 10:19
 */
public class Item {

	@JsonProperty("code")
	private String code;
	@JsonProperty("qty")
	private int qty;

	public Item() {

	}

	public Item(String code, int qty) {
		super();
		this.code = code;
		this.qty = qty;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
