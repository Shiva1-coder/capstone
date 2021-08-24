package com.dbs.trade.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SellOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Client client;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Instrument instrument;
	@Column(nullable=false)
	private double price;
	@Column(nullable=false)
	private int quantity;
	@Column(nullable=false)
	private String status;
	
	public SellOrder() {
		// TODO Auto-generated constructor stub
	}

	public SellOrder(int orderId, Client client, Instrument instrument, double price, int quantity, String status) {
		super();
		this.orderId = orderId;
		this.client = client;
		this.instrument = instrument;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SellOrder [orderId=" + orderId + ", client=" + client + ", instrument=" + instrument + ", price=" + price
				+ ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	

}
