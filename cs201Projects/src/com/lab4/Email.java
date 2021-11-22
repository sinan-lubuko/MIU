package com.lab4;

public class Email extends Message {

    private String receiver;
    private String sender;
    private String subject;

    public Email(String text, String receiver, String sender, String subject) {
        super(text);
        this.receiver = receiver;
        this.sender = sender;
        this.subject = subject;
    }

    public String toString(){
        return "Text= "+text+", Receiver= "+receiver+", Sender="+sender+", Subject="+sender;
    }
}
