package com.MPesaStkPush.MPesaStkPush.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MpesaTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private Double amount;
    private String accountReference;
    private String transactionDesc;
    private String merchantRequestId;
    private String checkoutRequestId;
    private LocalDateTime timestamp;
    private String resultCode;
    private String resultDesc;

    public MpesaTransaction() {
    }

    public MpesaTransaction(Long id,
                            String phoneNumber,
                            Double amount,
                            String accountReference,
                            String transactionDesc,
                            String merchantRequestId,
                            String checkoutRequestId,
                            LocalDateTime timestamp,
                            String resultCode,
                            String resultDesc) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.accountReference = accountReference;
        this.transactionDesc = transactionDesc;
        this.merchantRequestId = merchantRequestId;
        this.checkoutRequestId = checkoutRequestId;
        this.timestamp = timestamp;
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public MpesaTransaction(String phoneNumber,
                            Double amount,
                            String accountReference,
                            String transactionDesc,
                            String merchantRequestId,
                            String checkoutRequestId,
                            LocalDateTime timestamp,
                            String resultCode,
                            String resultDesc) {
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.accountReference = accountReference;
        this.transactionDesc = transactionDesc;
        this.merchantRequestId = merchantRequestId;
        this.checkoutRequestId = checkoutRequestId;
        this.timestamp = timestamp;
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String accountReference) {
        this.accountReference = accountReference;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public String getMerchantRequestId() {
        return merchantRequestId;
    }

    public void setMerchantRequestId(String merchantRequestId) {
        this.merchantRequestId = merchantRequestId;
    }

    public String getCheckoutRequestId() {
        return checkoutRequestId;
    }

    public void setCheckoutRequestId(String checkoutRequestId) {
        this.checkoutRequestId = checkoutRequestId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @Override
    public String toString() {
        return "MpesaTransaction{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", amount=" + amount +
                ", accountReference='" + accountReference + '\'' +
                ", transactionDesc='" + transactionDesc + '\'' +
                ", merchantRequestId='" + merchantRequestId + '\'' +
                ", checkoutRequestId='" + checkoutRequestId + '\'' +
                ", timestamp=" + timestamp +
                ", resultCode='" + resultCode + '\'' +
                ", resultDesc='" + resultDesc + '\'' +
                '}';
    }
}

