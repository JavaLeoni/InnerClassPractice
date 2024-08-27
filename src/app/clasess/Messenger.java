package app.clasess;

import app.interfaces.Printer;

public class Messenger implements Printer {


    @Override
    public void print(String message) {
        System.out.println(message + "\n");
    }

    public void setSenderAndTextAndOut(Message message) {
        if (message.sender == null)
            if (message.text == null) {
                Messenger anonimClass = new Messenger() {
                    @Override
                    public void print(String message) {
                        System.out.println(message);
                    }
                };
               anonimClass.print("Опрацьовується пусте повідомлення від анонімного користувача...\n");
            } else print("Анонімний користувач відправив повідомлення: " + message.text);
        else
          if (message.text == null)
             print("Користувач " + message.sender + " відправив повідомлення: null");
           else
              print("Користувач " + message.sender + " відправив повідомлення: " + message.text);

        }



    public static class Message {
        String text;
        String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }


}
