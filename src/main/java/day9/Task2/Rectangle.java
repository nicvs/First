package day9.Task2;

public class Rectangle extends Figure{
    int a, b;

    public Rectangle(int a, int b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
}
