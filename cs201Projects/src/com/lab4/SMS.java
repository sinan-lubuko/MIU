package com.lab4;

public class SMS extends Message {
    private String recipientContactNo;

    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String toString(){
        return "Text= "+text+", Recipient Contact Number= "+recipientContactNo;
    }
}
