package day15;

public class Shoe {
    private String name;
    private int size;
    private int count;

    public Shoe(String name, int size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return name + ", " + size + ", " + count;
    }
}
