package com.example._01_dependecy_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("_01_dependency_inject/spring_dia.xml");
        PayServiceProvider provider = (PayServiceProvider) context.getBean("paymentProvider");
        provider.performPayment();

        PayServiceProvider bitServiceProvider = (PayServiceProvider) context.getBean("bitcoinPaymentProvider");
        bitServiceProvider.performPayment();

        PayServiceProvider creditPayServiceProvider = (PayServiceProvider) context.getBean("creditPaymentProvider");
        creditPayServiceProvider.performPayment();


        System.out.println("merhaba");



    }

}
