package com.tnsif.framewrok;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo,String accNm,float charges) {
		super();
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
		// TODO Auto-generated constructor stub
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
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges=charges;
}
public void setAccNo(int accNo) {
	this.accNo=accNo;
}
abstract public void bookproduct(float charges);
@Override
public String toString() {
	return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges="+ charges+",getAccNo()="+getAccNo()+",getAccNm()="+getAccNm()+",getCharges()="+getCharges()+",getClass()="+getClass()+",hashCode()="+hashCode()+",toString()="+super.toString()+"]";"
			            
}
}