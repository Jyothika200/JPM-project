package com.tnsif.goshopapp.framework;

public class PrimeAcc extends ShopAcc  {
	boolean isprime;

	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {

}
	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + "]";
	}
}
