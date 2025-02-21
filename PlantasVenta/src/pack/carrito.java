package pack;

public class carrito {
    productos[] productos;
    int cantidadProductos;

    public carrito() {
        productos = new productos[10]; // Tamaño fijo para el carrito
        cantidadProductos = 0; // Contador de productos en el carrito
    }

    public void agregarProducto(productos producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("El carrito está lleno.");
        }
    }
}