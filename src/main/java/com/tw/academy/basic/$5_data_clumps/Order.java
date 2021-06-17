package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    public String getBuyerName() {
        return this.user.getBuyerName();
    }

    public void setBuyerName(String buyerName) {
        this.user = new User();
        this.user.setBuyerName(buyerName);
    }

    private User user;

    public String getBuyerPhoneNumber() {
        return this.user.getBuyerPhoneNumber();
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.user.setBuyerPhoneNumber(buyerPhoneNumber);
    }

    private String buyerAddress;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setBuyerName(buyerName);
        this.setBuyerPhoneNumber(buyerPhoneNumber);
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getBuyerName(), this.getBuyerPhoneNumber(), buyerAddress);
    }
}

