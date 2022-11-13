package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher ivanov = new Teacher("Иванов Иван Иванович","Математика");
        Student petrov = new Student("Петров Петр");

        ivanov.evaluate(petrov);
    }
}
