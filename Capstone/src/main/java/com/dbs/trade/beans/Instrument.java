package com.dbs.trade.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instrument {
	@Id
	private String instrumentId;
	@Column(nullable=false)
	private String instrumentName;
	private LocalDate expiryDate;
	@Column(nullable=false)
	private double faceValue;
	
	public Instrument() {
		// TODO Auto-generated constructor stub
	}

	public Instrument(String instrumentId, String instrumentName, LocalDate expiryDate, double faceValue) {
		super();
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.expiryDate = expiryDate;
		this.faceValue = faceValue;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(double faceValue) {
		this.faceValue = faceValue;
	}

	@Override
	public String toString() {
		return "Instrument [instrumentId=" + instrumentId + ", instrumentName=" + instrumentName + ", expiryDate="
				+ expiryDate + ", faceValue=" + faceValue + "]";
	}
	
	

}
