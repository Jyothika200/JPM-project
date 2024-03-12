package com.tnsif.goshopapp.application;
import com.tnsif.goshopapp.framework.NormalAcc;

public class Gsnormal extends NormalAcc {

	public Gsnormal(int accNo, String accNm, float charges, float deliverycharge) {
		super(accNo, accNm, charges, deliverycharge);
		// TODO Auto-generated constructor stub
	}
	
public void bookproduct(float charges) {
	
}

@Override
public String toString() {
	return "Gsnormal []";
}
}
