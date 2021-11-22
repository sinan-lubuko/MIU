package com.lab4;

public class MessageMainApp {

    public static void main(String[] args){
        Message sms = new SMS("Good morning", "2022022022");
        Message email = new Email("Do not forget to send me the documents", "abc@abc.com", "xyz@xyz.com", "Reminder");

        System.out.println(ContainsKeyword(sms, "evening"));
        System.out.println(ContainsKeyword(email, "forget"));

        String encodedMessage = Message.encode("This is Java");
        System.out.println(encodedMessage); //UijtjtKbwb
    }

    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
}
