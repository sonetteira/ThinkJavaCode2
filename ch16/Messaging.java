public class Messaging {
    public static void main(String[] args) {
        MessageClient mom = new MessageClient("0123456", "Vicky");
        MessageClient ann = new MessageClient("7894561", "Ann");
        MessageClient[] to = {ann};
        SMSMessage message1 = new SMSMessage("good morning", mom, to);
        message1.send();
    }
}

interface Message {
    public String getMessageBody();
    public MessageClient getFrom();
    public MessageClient[] getToList();
    public String getToListString();
    public void send();
}

class SMSMessage implements Message{
    private boolean sent;
    private String body;
    private MessageClient[] toList;
    private MessageClient from;
    
    public SMSMessage(String messageBody, MessageClient from, MessageClient[] to) {
        this.sent = false;
        this.body = messageBody;
        this.from = from;
        this.toList = to;
    }

    public String getMessageBody() {
        return body;
    }

    public MessageClient getFrom() {
        return from;
    }
    
    public MessageClient[] getToList() {
        return toList;
    }

    public String getToListString() {
        StringBuilder sb = new StringBuilder();
        for(MessageClient mc : toList) {
            sb.append(mc);
        }
        return sb.toString();
    }

    public void send() {
        for(MessageClient receiver : toList) {
            receiver.acceptMessage(this);
        }
        sent = true;
    }
}

class MessageClient {
    private String id;
    private String handle;
    private MessageClient[] blocked;

    public MessageClient(String id, String handle) {
        this.id = id;
        this.handle = handle;
        this.blocked = new MessageClient[0];
    }
    public void acceptMessage(Message message) {
        if(!checkBlocked(message.getFrom())) {
            // user is not blocked
            System.out.printf("From: %s\nTo: %s\nMesssage: %s\n", message.getFrom(), message.getToListString(), message.getMessageBody());
        }
    }
    
    private boolean checkBlocked(MessageClient user) {
        // check if a client is in the blocked list
        for(MessageClient mc : blocked) {
            if(mc.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return handle;
    }
}