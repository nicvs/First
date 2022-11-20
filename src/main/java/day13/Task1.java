package day13;


public class Task1  {
    public static void main(String[] args) {
        User user1 = new User("Вася");
        User user2 = new User("Петя");
        User user3 = new User("Дима");

        user1.sendMessage(user2,"Петя, привет!");
        user1.sendMessage(user2,"Как дела?");
        user2.sendMessage(user1,"Привет");
        user2.sendMessage(user1,"Дела - ");
        user2.sendMessage(user1,"нормально");
        user3.sendMessage(user1,"Первое");
        user3.sendMessage(user1,"Второе");
        user3.sendMessage(user1,"Третье");
        user1.sendMessage(user3,"1-е");
        user1.sendMessage(user3,"2-е");
        user1.sendMessage(user3,"3-е");
        user3.sendMessage(user1,"Четвертое");

        MessageDatabase.showDialog(user1,user3);
        System.out.println("");
        System.out.println(MessageDatabase.getMessages().get(0));
    }
}