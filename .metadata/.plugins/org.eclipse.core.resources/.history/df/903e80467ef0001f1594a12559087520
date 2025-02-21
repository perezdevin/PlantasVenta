package pack;

public class menu {
    public static void main(String[] args) {
        // crear el inventario
        inventario inventario = new inventario();

        // crear carrito
        carrito carrito = new carrito();

        // Agregar un producto al carrito
        carrito.agregarProducto(inventario.productos[1]); // Agrega hierba de los bosques

        // ver productos en el carrito
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < carrito.cantidadProductos; i++) {
            productos producto = carrito.productos[i];
            System.out.println(producto.nombre + " - " + producto.origen + " - $" + producto.precio);
        }
    }
}