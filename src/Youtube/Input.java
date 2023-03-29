package Youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        //buffer adelanta la accion que le pido
        BufferedReader reader = new BufferedReader(capturarTeclado);

        System.out.println("Ingresa tu nombre: ");
        String name = reader.readLine();
        System.out.println("Hola " + name);

        System.out.println("Ingresa tu edad: ");
        String strAge = reader.readLine();
        Integer age = Integer.parseInt(strAge);
        if (age < 18) {
            System.out.println(name + " Eres menor de edad");
        } else if (age > 18 && age < 30) {
            System.out.println(name + " Es mayor de edad");
        } else if (age > 30 && age <= 60) {
            System.out.println(name + " Aun eres Jovenn");
        } else if (age > 61) System.out.println(name + " Wey ya pasaste los 60");


        System.out.println("Ingresa el número 1: ");
        String number1 = reader.readLine();
        Integer numero1 = Integer.parseInt(number1);

        System.out.println("Ingresa el número 2: ");
        String number2 = reader.readLine();
        Integer numero2 = Integer.parseInt(number2);

        System.out.println("Ingresa el número 3: ");
        String number3 = reader.readLine();
        Integer numero3 = Integer.parseInt(number3);


        Integer highestNumber = numero1;

        if (numero2 > numero1) {
        highestNumber = numero2  ;
        }if (numero3 > numero1) {
            highestNumber = numero3  ;
        }
        System.out.println("El numero mayor es: "+ highestNumber);
    }
}
