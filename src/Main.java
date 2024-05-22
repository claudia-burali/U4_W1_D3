import entities.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle firstRec = new Rectangle(4.5, 3.5);
        firstRec.area();
        firstRec.perimetro();
        firstRec.stampaRettangolo();
        Rectangle secondRec = new Rectangle(3, 6.5);
        secondRec.area();
        secondRec.perimetro();
        secondRec.stampaRettangolo();

    }
}