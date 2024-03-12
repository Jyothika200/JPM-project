package com.tnsif.goshopapp.application;
import com.tnsif.goshopapp.framework.PrimeAcc;


public class Gsprime extends PrimeAcc {

	public Gsprime(int accNo, String accNm, float charges,boolean isprime) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	public static final float charges=0;
	public void bookproduct(float charges) {
		
	}
	@Override
	public String toString() {
		return "Gsprime []";
	}

}
