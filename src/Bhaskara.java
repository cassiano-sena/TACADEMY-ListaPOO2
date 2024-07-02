//10 - Escreva uma classe que permita o usuário fazer as entradas e calcular a fórma de
//bhaskara
public class Bhaskara {
    private double a;
    private double b;
    private double c;
    public void setCoefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calculateRoots() {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are complex:");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
