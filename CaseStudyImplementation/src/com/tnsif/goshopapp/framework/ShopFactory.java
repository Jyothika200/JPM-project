package com.tnsif.goshopapp.framework;

public interface ShopFactory {
	abstract PrimeAcc getNewprimeAccount(int accNo,String accNm,float  charges,boolean isPrime);
	abstract NormalAcc getNewnormalAccount(int accNo,String accNm,float charges,float deliverycharges);;
	
	

}
