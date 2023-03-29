package MuchasCosas;

import java.util.Scanner;

public class SacaHipotenusaEnSegundoss {
    public static void main(String[] args) {
        double x;
        double y;
        double z;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa valor x del triangulo: ");
        x = scanner.nextDouble();
        System.out.println("Ingresa valor y del triangulo: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("La hipotenusa tiene este valor: "+z);
        scanner.close();


}}
