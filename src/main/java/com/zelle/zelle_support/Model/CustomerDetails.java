package com.zelle.zelle_support.Model;

import java.util.List;

public class CustomerDetails {
    // contains customer details, list of accounts, list of tokens, list of recipients
    private Customer customer;
    private List<Account> accounts;
    private List<Token> tokens;
    private List<Recipients> recipients;
    private List<Payment> payments;

    public CustomerDetails(Customer customer, List<Account> accounts, List<Token> tokens, List<Recipients> recipients, List<Payment> payments) {
        this.customer = customer;
        this.accounts = accounts;
        this.tokens = tokens;
        this.recipients = recipients;
        this.payments = payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public List<Recipients> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipients> recipients) {
        this.recipients = recipients;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
