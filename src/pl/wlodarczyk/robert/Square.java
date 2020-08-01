package pl.wlodarczyk.robert;

public class Square extends Figura implements DayTable {

    private int a;

    public Square(String name, int a) {

        super(name);
        this.a = a;
    }


    @Override
    public int getField() {
        return a * a;


    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
