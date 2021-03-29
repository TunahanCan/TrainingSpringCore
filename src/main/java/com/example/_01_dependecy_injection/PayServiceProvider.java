package com.example._01_dependecy_injection;



import org.apache.log4j.Logger;

public class PayServiceProvider implements IPayService {

    Logger log = Logger.getLogger(getClass());

    private IPayment ipayment;

    PayServiceProvider(){};

    PayServiceProvider(IPayment pay) {
        this.ipayment = pay;
    }

    @Override
    public void performPayment() {
        log.error("log attention");
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
