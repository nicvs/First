package day13;
import java.util.Date;

public class Massage {
    private Date date = new Date();
    private User sender;
    private User receiver;
    private String text;

    public Massage(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "FROM: "+sender + "\n"+
                "TO: "+receiver + "\n"+
                "ON: "+date+ "\n"+
                text;

    }

}
