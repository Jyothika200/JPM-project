package com.tnsif.application;
import com.tnsif.framewrok.NormalAcc;
import com.tnsif.framewrok.PrimeAcc;

public class GSNormal extends NormalAcc {
	public GSNormal(int accNo,String accNm,float charges,float deliverycharges) {
super(accNo,accNm,charges,deliverycharges);

}
	public void bookproduct(float charges) {
		System.out.println("dear normal account user your product charges are:"+getCharges()+"delivery charges"+getDeliverycharges());
	}
}