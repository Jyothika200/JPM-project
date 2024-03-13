package com.tnsif.application;
import com.tnsif.framewrok.PrimeAcc;

public class GSPrime extends PrimeAcc {

	public GSPrime(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {
		System.out.println("dear prime user,your product charges are:"+getCharges());
	}
	@Override
	public String toString() {
		return "GSPrime [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
