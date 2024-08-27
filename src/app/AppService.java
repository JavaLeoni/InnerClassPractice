package app;

import app.clasess.Messenger;

public class AppService {

    public void MainService() {
       Messenger messenger = new Messenger();

       //sender = null, text = null
       Messenger.Message message= new Messenger.Message(null,null);
       System.out.println("1)" + "Sender: " + message.getSender() +  "," + "Text: " + message.getText());
       messenger.setSenderAndTextAndOut(message);


       //sender = Mr Sender, text = null
       message.setSender("Mr Sender");
       System.out.println("2)" + "Sender: " + message.getSender() +  "," + "Text: " + message.getText());
       messenger.setSenderAndTextAndOut(message);

        //sender = null, text = "ABC"
        message.setSender(null);
        message.setText("ABC");
        System.out.println("3)" + "Sender: " + message.getSender() +  "," + "Text: " + message.getText());
        messenger.setSenderAndTextAndOut(message);

        //sender = Mr Sender, text = "ABC"
        message.setSender("Mr Sender");
        message.setText("");
        System.out.println("4)" + "Sender: " + message.getSender() +  "," + "Text: " + message.getText());
        messenger.setSenderAndTextAndOut(message);


    }
}
