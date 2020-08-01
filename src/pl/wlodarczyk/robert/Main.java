package pl.wlodarczyk.robert;

public class Main {

    public static void main(String[] args) {

        Square square = new Square("Kwadrat",5);
        System.out.println(square.getField());

        Rectangle rectangle = new Rectangle("Prostokąt",5,6);
        System.out.println(rectangle.getField());

        Figura[] figury = {square,rectangle};

        for (Figura figura : figury) {

            System.out.println(figura.getField());

        }

    }
}
