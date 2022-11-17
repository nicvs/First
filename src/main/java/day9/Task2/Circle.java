package day9.Task2;

public class Circle extends Figure{
    int r;

    public Circle(int r,String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*this.r*this.r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.r;
    }
}
