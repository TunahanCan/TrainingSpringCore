package com.example._01_dependecy_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_01_dependency_inject/spring_dia.xml");
        PayServiceProvier provier = (PayServiceProvier) context.getBean("paymentProvider");
        provier.performPayment();

        PayServiceProvier bitServiceProvider = (PayServiceProvier) context.getBean("bitcoinPaymentProvider");
        bitServiceProvider.performPayment();


    }

}
