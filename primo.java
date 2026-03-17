import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
