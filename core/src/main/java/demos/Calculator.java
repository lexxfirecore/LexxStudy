package demos;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator =  new Calculator();
        calculator.calculeazaDescriminant(1,3,2);
    }

    int getSum(int a, int b) {
        int suma = a + b;
        return suma;
    }

    int getSubtraction(int a, int b) {
        int diff = a - b;
        return diff;
    }

    int getMultiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    double getDivide(double a, double b) {
        double divid = a / b;
        return divid;
    }

    void calculeazaDescriminant( double a, double b, double c) {
        double x1;
        double x2;
        double descriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println(descriminant);

        if (descriminant > 0) {
            x1 = (-b + Math.sqrt(descriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(descriminant)) / (2 * a);

            System.out.println("x1= " + x1 + " " + "x2= " + x2);

        } else {
            if (descriminant == 0) {
                x1 = x2 = -b / (2 * a);
                System.out.println("x1= " + x1 + " " + "x2= " + x2);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        }


    }
}