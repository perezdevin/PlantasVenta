package pack;

public class inventario {
    productos[] productos;

    public inventario() {
        // menu de productos
        productos = new productos[4];
        productos[0] = new productos("Maria Juana", "Mexico", 1.70);
        productos[1] = new productos("Hierba de los bosques", "Andorra", 4.20);
        productos[2] = new productos("La seta feliz", "Marrueco", 2.47);
        productos[3] = new productos("El oro verde", "Palestina", 1.33);
    }
}