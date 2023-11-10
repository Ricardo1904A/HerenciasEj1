import java.util.List;
import java.util.Scanner;

public class Rectangulo extends Figura {

    public Rectangulo() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (int i=0; i <4 ; i++){
            System.out.println("Ingrese el componenete x del punto "+i);
            double x = sc.nextDouble();
            System.out.println("Ingrese el componenete y del punto "+i);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.ListaPuntos.add(punto);
        }
    }

    double calcularPerimetro() {
        Punto p1 = this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);
        Punto p4 = this.ListaPuntos.get(3);
double l1 = p1.calculoDistancia(p2);
double l2 = this.calculoDistancia(p1,p3);
this.perimetro = l1*2+l2*2;
return this.perimetro;

    }
    double calcularArea(){
        Punto p1 = this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);
        Punto p4 = this.ListaPuntos.get(3);
        double l1 = p1.calculoDistancia(p2);
        double l2 = this.calculoDistancia(p1,p3);
        this.area = l1*l2;
        return this.area;
}

}