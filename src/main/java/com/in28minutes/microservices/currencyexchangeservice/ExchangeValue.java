package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	private BigDecimal multiploConversion;
	private int puerto;
	
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal multiploConversion) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiploConversion = multiploConversion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public BigDecimal getMultiploConversion() {
		return multiploConversion;
	}

	public void setMultiploConversion(BigDecimal multiploConversion) {
		this.multiploConversion = multiploConversion;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
	
}
