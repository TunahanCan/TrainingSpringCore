package com.example._01_dependecy_injection;

public class PayServiceProvier implements IPayService {

    private IPayment ipayment;

    PayServiceProvier(){};

    PayServiceProvier(IPayment pay) {
        this.ipayment = pay;
    }

    @Override
    public void performPayment() {
        System.out.println("attention! payment transaction is being processed");
        ipayment.executePaymet();
    }

    public IPayment getIpayment() {
        return ipayment;
    }

    public void setIpayment(IPayment ipayment) {
        this.ipayment = ipayment;
    }
}
