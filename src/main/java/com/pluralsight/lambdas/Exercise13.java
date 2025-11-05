package com.pluralsight.lambdas;

public class Exercise13 {
    static void main() {
    MessageHandler handler = message -> System.out.println(message.toUpperCase());
    Exercise13 ex = new Exercise13();
    ex.sendMessage(handler);
    }
    public void sendMessage(MessageHandler handler){
        handler.handle("Hello from method!");
    }
}
