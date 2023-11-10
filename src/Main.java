// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.ingresarPuntos();
        double areac1 = c1.calcularArea();
        double perimetroc1 = c1.calcularPerimetro();
        c1.imprimirArea("circulo 1");
        c1.imprimirPerimetro("circulo 1");


        Triangulo t1 = new Triangulo();
        t1.ingresarPuntos();
        t1.calcularPerimetro();
        t1.calcularArea();
        t1.imprimirPerimetro("Triangulo 1");
        t1.imprimirArea("Triangulo 1");
}
}