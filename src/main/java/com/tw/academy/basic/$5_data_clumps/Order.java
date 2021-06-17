package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private User user;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this(orderNumber, new User(buyerName, buyerPhoneNumber, buyerAddress));
    }

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;
        this.user = user;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.user.getBuyerName(), this.user.getBuyerPhoneNumber(), this.user.getBuyerAddress());
    }
}

