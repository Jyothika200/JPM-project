package com.tnsif.application;
import com.tnsif.framewrok.NormalAcc;
import com.tnsif.framewrok.PrimeAcc;
import com.tnsif.framewrok.ShopFactory;


public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc=new GSPrime(accNo,accNm,charges,isPrime);
		return primeacc;
		// TODO Auto-generated method stub
	
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges) {
		// TODO Auto-generated method stub
		NormalAcc normalacc=new GSNormal(accNo,accNm,charges,deliverycharges);;
		return normalacc;
	
	}
	
	

}
