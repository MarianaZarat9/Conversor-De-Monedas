package Servicio;

import java.util.Scanner;

public class Principal {
    private static ConversorAPI conversorAPI = new ConversorAPI();


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double valorAConvertir;

        System.out.println("Bienvenido al Conversor de Monedas de Marana");
        System.out.println("******************************************");

        System.out.println("Elija el número con las divisas a la que desea utilizar:");
        String menu = """
                1. Dolar ==> Peso Mexicano
                2. Peso Mexicano ==> Dolar
                3. Dolar ==> Peso Colombiano
                4. Peso Colombiano ==> Dolar
                5. Dolar ==> Yen Japonés
                6. Yen Japonés ==> Dolar
                7. Salir
                """;

        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("USD","MXN",valorAConvertir);
                    break;

                case 2:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("MXN", "USD",valorAConvertir);
                    break;
                case 3:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("USD","COP",valorAConvertir);

                    break;
                case 4:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("COP","USD",valorAConvertir);
                    break;
                case 5:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("USD","JPY",valorAConvertir);
                    break;
                case 6:
                    System.out.println("Indique el valor que desea convertir: ");
                    valorAConvertir = teclado.nextDouble();
                    conversorAPI.obtenerDatos("JPY","USD",valorAConvertir);
                    break;
                case 7:
                    break;

                default:
                    break;
            }

        }
    }
}
