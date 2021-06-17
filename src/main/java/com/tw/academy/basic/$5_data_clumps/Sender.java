package com.tw.academy.basic.$5_data_clumps;

public class Sender {

  private final String senderName;
  private final String senderPhoneNumber;
  private final String senderAddress;

  public Sender(String senderName, String senderPhoneNumber, String senderAddress) {
    this.senderName = senderName;
    this.senderPhoneNumber = senderPhoneNumber;
    this.senderAddress = senderAddress;
  }

  public String getSenderName() {
    return senderName;
  }

  public String getSenderPhoneNumber() {
    return senderPhoneNumber;
  }

  public String getSenderAddress() {
    return senderAddress;
  }
}
