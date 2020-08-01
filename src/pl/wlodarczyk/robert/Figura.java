package pl.wlodarczyk.robert;

public abstract class Figura implements IFieldable {

    private String name;

    public Figura(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
