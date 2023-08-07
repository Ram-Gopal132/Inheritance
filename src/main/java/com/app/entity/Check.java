package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="chque_entered")
public class Check extends Payment{
	
	@Column(name="cheque_nO")
	private int chequeNo;
	
	@Column(name="chqType")
	private String chqType;

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChqType() {
		return chqType;
	}

	public void setChqType(String chqType) {
		this.chqType = chqType;
	}
	
	
	

}
