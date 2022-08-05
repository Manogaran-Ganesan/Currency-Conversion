package com.in28mints.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal total;
	private String Environment;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean(int id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal total, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.total = total;
		Environment = environment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getEnvironment() {
		return Environment;
	}

	public void setEnvironment(String environment) {
		Environment = environment;
	}

}
