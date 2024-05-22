package entities;

public class Rectangle {
    private double lato_1;
    private double lato_2;

    public Rectangle (double lato_1, double lato_2) {
        this.lato_1 = lato_1;
        this.lato_2 = lato_2;
    }
    public double area() {
        return this.lato_1 * this.lato_2;
    }
    public double perimetro() {
        return (this.lato_1 + this.lato_2) *2;
    }
    public void stampaRettangolo() {
        System.out.println("L'area del rettangolo è " + area() + " e il perimetro è " + perimetro());
    }

}
