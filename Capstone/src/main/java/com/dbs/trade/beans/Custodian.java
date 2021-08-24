package com.dbs.trade.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Custodian {
	@Id
	private String custodianId;
	@Column(nullable=false)
	private String custodianName;
	
	public Custodian() {
		// TODO Auto-generated constructor stub
	}

	public Custodian(String custodianId, String custodianName) {
		super();
		this.custodianId = custodianId;
		this.custodianName = custodianName;
	}

	public String getCustodianId() {
		return custodianId;
	}

	public void setCustodianId(String custodianId) {
		this.custodianId = custodianId;
	}

	public String getCustodianName() {
		return custodianName;
	}

	public void setCustodianName(String custodianName) {
		this.custodianName = custodianName;
	}

	@Override
	public String toString() {
		return "Custodian [custodianId=" + custodianId + ", custodianName=" + custodianName + "]";
	}
	
	
	
	

}
