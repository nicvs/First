package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher (String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public void evaluate (Student student1){
        Random i = new Random();
        String marks[] = {"неудовлетворительно","удовлетворительно","хорошо","отлично"};

        System.out.println("Преподаватель "+name+" оценил студента с именем "+student1.getName()+" по предмету "
        +subject+" на оценку "+marks[i.nextInt(4)]);

    }
}
