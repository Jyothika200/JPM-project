package com.tnsif.goshopapp.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm=accNm;
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
	public void bookproduct(float charges) {
		
	}
	public void items(float charges) {
	
	}

}
