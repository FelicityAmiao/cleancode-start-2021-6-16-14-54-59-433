package com.tw.academy.basic.$5_data_clumps;

public class User {

  private String buyerName;
  private String buyerPhoneNumber;
  private String buyerAddress;

  public User(String buyerName, String buyerPhoneNumber) {
    this.buyerName = buyerName;
    this.buyerPhoneNumber = buyerPhoneNumber;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getBuyerPhoneNumber() {
    return buyerPhoneNumber;
  }

  public void setBuyerPhoneNumber(String buyerPhoneNumber) {
    this.buyerPhoneNumber = buyerPhoneNumber;
  }

  public String getBuyerAddress() {
    return buyerAddress;
  }

  public void setBuyerAddress(String buyerAddress) {
    this.buyerAddress = buyerAddress;
  }
}
