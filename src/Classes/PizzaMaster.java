package Classes;

import java.util.Scanner;

public class PizzaMaster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean exit = false;

        try {
            do {
                System.out.println("**** Elije que pizza quieres hacer ****");
                System.out.println("1. Margarita");
                System.out.println("2. Pepperoni");
                System.out.println("3. Cuatro Quesos");
                System.out.println("4. Salir");

                System.out.print("Ingresa tu opción: ");
                choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("Has elegido hacer una Pizza Margarita.");
                        break;
                    case 2:
                        System.out.println("Has elegido hacer una Pizza Pepperoni.");
                        break;
                    case 3:
                        System.out.println("Has elegido hacer una Pizza Cuatro Quesos.");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elije una opción válida.");
                }
            } while (!exit);

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}


