package pack;


import java.util.Scanner;


public class menu {
    public static void main(String[] args) {
        // Datos de productos
        String[] nombres = {"Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde"};
        String[] origenes = {"Mexico", "Andorra", "Marrueco", "Palestina"};
        double[] precios = {1.70, 4.20, 2.47, 1.33};

        // carrito
        String[] carritoNombres = new String[10]; // nombre productos del carrito
        double[] carritoPrecios = new double[10]; // precio productos carrito
        int cantidadProductos = 0; // contador carrito

        // entrada user
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // menu
        do {
            System.out.println("\nBienvenido a la tienda de plantas!");
            System.out.println("1. Buscar plantas");
            System.out.println("2. Ver carrito");
            System.out.println("3. Agregar producto al carrito");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // buscar plantas
                    System.out.print("\nIngrese el nombre de la planta a buscar: ");
                    String nombreBuscado = scanner.nextLine();
                    System.out.println("Resultados de la búsqueda:");
                    boolean encontrado = false;
                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].toLowerCase().contains(nombreBuscado.toLowerCase())) {
                            System.out.println(nombres[i] + " - " + origenes[i] + " " + precios[i] + " pavetes");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron plantas con ese nombre.");
                    }
                    break;

                case 2:
                    // ver carrito
                    System.out.println("\nProductos en el carrito:");
                    if (cantidadProductos == 0) {
                        System.out.println("El carrito está vacío.");
                    } else {
                        for (int i = 0; i < cantidadProductos; i++) {
                            System.out.println(carritoNombres[i] + " " + carritoPrecios[i] + " pavetes");
                        }
                    }
                    break;

                case 3:
                    // añadirr producto al carrito
                    System.out.println("\nProductos disponibles:");
                    for (int i = 0; i < nombres.length; i++) {
                        System.out.println((i + 1) + ". " + nombres[i] + " - " + origenes[i] + " " + precios[i] + " pavetes");
                    }
                    System.out.print("Seleccione el número del producto a agregar: ");
                    int seleccion = scanner.nextInt();
                    if (seleccion >= 1 && seleccion <= nombres.length) {
                        carritoNombres[cantidadProductos] = nombres[seleccion - 1];
                        carritoPrecios[cantidadProductos] = precios[seleccion - 1];
                        cantidadProductos++;
                        System.out.println("Producto agregado al carrito: " + nombres[seleccion - 1]);
                    } else {
                        System.out.println("Selección no válida.");
                    }
                    break;

                case 4:
                    // Salir
                    System.out.println("\nGracias por visitar la tienda. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}