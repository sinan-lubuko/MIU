package com.lab4;

public class Message {

    protected String text;

    public Message(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString(){
        return text;
    }

    public static String encode(String text){
        //A -> B, a ->b .... M->N, m->n, Z->A, z->a
        //This is Java => UijtjtKbwb.
        String encoded = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(ch == 'Z'){
                    ch = 'A';
                }
                else if(ch == 'z'){
                    ch = 'a';
                }
                else {
                    ch = (char)(ch + 1);
                }
                encoded = encoded+ch;
            }
        }
        return encoded;
    }
}
