package day9.Task2;

public class Triangle extends Figure{
    int a, b ,c;

    public Triangle(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = this.perimeter();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
