import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa un numero: ");
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("los dos numeros son iguales");
        } else if (num1>num2) {
            System.out.println(num1 + " es mayor que " + num2);
            System.out.println(num2 + " es menor que " + num1);
        }
        else {
            System.out.println(num2 + " es mayor que " + num1);
            System.out.println(num1 + " es menor que " + num2);
        }

        scanner.close();
    }
}


