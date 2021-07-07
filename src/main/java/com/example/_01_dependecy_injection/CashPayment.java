package com.example._01_dependecy_injection;

public class CashPayment implements IPayment{

	@Override
	public void executePayment() {
		// TODO Auto-generated method stub
		System.out.println("perform for CashPayment");
	}

}
