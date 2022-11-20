package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase  {
    static List <Massege> massages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        massages.add(new Massege(u1,u2,text));
    }
    public static List <Massege> getMessages(){
        return massages;
    }

    public static void showDialog(User u1, User u2){
        for (Massege massage:massages){
            if ((massage.getSender().equals(u1)||massage.getSender().equals(u2))&&
                    (massage.getReceiver().equals(u1)||massage.getReceiver().equals(u2))){
                System.out.println(massage.getSender()+": "+massage.getText());
            }
        }
    }
}