package com.zelle.zelle_support.Service;

import com.zelle.zelle_support.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    // return a CustomerDetails object with dummy data filled in
    public CustomerDetails getDummyCustomerDetails() {

        Customer customer = new Customer(1L, "John", "Doe", "john@gmail.com");
        List<Account> accounts =  new ArrayList<>(List.of(
                new Account(1L, "123456", "Savings", "Active"),
                new Account(2L, "654321", "Checking", "Active"),
                new Account(3L, "987654", "Savings", "Active")
        ));

        List<Token> tokens = new ArrayList<>(List.of(
                new Token(1L, "6598469824", "Access", "Active"),
                new Token(2L, "sample@gmail.com", "Access", "Active"),
                new Token(3L, "sample-zelle-tag", "Access", "Active")
        ));

        List<Recipients> recipients = new ArrayList<>(List.of(
                new Recipients("123456", "123456", "Active", "John Doe"),
                new Recipients("654321", "654321", "Active", "Jane Doe"),
                new Recipients("987654", "987654", "Active", "John Smith")
        ));

        List<Payment> payments = new ArrayList<>(List.of(
                new Payment(10L, PaymentType.PAYMENT_SENT, 100L, "2021-01-01", "Delivered"),
                new Payment(11L, PaymentType.PAYMENT_SENT, 110L, "2021-01-01", "Delivered"),
                new Payment(12L, PaymentType.PAYMENT_RECEIVED, 120L, "2021-01-01", "Delivered"),
                new Payment(13L, PaymentType.PAYMENT_RECEIVED, 130L, "2021-01-01", "Delivered"),
                new Payment(20L, PaymentType.REQUEST_SENT, 200L, "2021-01-02", "Sent"),
                new Payment(21L, PaymentType.REQUEST_SENT, 210L, "2021-01-02", "Sent"),
                new Payment(30L, PaymentType.REQUEST_RECEIVED, 300L, "2021-01-03", "Sent"),
                new Payment(40L, PaymentType.REQUEST_RECEIVED, 400L, "2021-01-04", "Sent")
        ));

        return new CustomerDetails(customer, accounts, tokens, recipients, payments);
    }

}
