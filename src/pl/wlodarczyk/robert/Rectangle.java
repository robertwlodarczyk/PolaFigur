package pl.wlodarczyk.robert;

public class Rectangle extends Figura implements DayTable {

    private int a;
    private int b;


    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;

    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public int getField() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
