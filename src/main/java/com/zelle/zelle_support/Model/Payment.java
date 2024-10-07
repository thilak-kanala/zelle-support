package com.zelle.zelle_support.Model;

public class Payment {
    Long id;
    PaymentType paymentType;
    Long dollarAmount;
    String paymentDate;
    String paymentStatus;

    public Payment(Long id, PaymentType paymentType, Long dollarAmount, String paymentDate, String paymentStatus) {
        this.id = id;
        this.paymentType = paymentType;
        this.dollarAmount = dollarAmount;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Long getDollarAmount() {
        return dollarAmount;
    }

    public void setDollarAmount(Long dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentType=" + paymentType +
                ", dollarAmount=" + dollarAmount +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
