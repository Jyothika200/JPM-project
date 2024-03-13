package com.tnsif.framewrok;

public interface ShopFactory {
public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime);

NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges);

}
