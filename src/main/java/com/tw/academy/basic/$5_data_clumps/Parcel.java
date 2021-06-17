package com.tw.academy.basic.$5_data_clumps;

public class Parcel {

    private final Receiver receiver;
    private String size;
    private Double weight;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    public Parcel(String size, Double weight,
        Receiver receiver, Sender sender) {
        this.size = size;
        this.weight = weight;
        this.receiver = receiver;
        this.senderName = sender.getSenderName();
        this.senderPhoneNumber = sender.getSenderPhoneNumber();
        this.senderAddress = sender.getSenderAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
            this.receiver.getReceiverName(), this.receiver.getReceiverPhoneNumber(), this.receiver.getReceiverAddress());
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
