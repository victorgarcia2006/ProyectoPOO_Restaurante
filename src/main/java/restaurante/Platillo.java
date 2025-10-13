package restaurante;

public class Platillo {
    String nombre;
    double precio;
    Ingrediente[] ingredientes;
    
    //Constructor
    public Platillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new Ingrediente[10];
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] == null) {
                ingredientes[i] = ingrediente;
                break;
            }
        }
    }

    public void mostrarPlatillo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Ingredientes:");
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                System.out.println(ingredientes[i].getNombre() + " - " + ingredientes[i].getCantidad());
            }
        }
    }
}
