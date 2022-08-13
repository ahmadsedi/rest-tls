package com.ahmadsedighi.security.tls.resttls.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 13/08/2022
 * Time: 10:19
 */
public class PaymentMethod {

	@JsonProperty("card_type")
	private String cardType;
	@JsonProperty("expiration")
	private String expiration;
	@JsonProperty("name")
	private String name;
	@JsonProperty("billing_address")
	private String biilingAddress;

	public PaymentMethod() {

	}

	public PaymentMethod(String cardType, String expiration, String name, String biilingAddress) {
		super();
		this.cardType = cardType;
		this.expiration = expiration;
		this.name = name;
		this.biilingAddress = biilingAddress;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiilingAddress() {
		return biilingAddress;
	}

	public void setBiilingAddress(String biilingAddress) {
		this.biilingAddress = biilingAddress;
	}
}
