package restaurante;

public class Mesa {
    int numero_Mesa;
    int capacidad;
    //Constructor
    public Mesa(int numero_Mesa, int capacidad) {
        this.numero_Mesa = numero_Mesa;
        this.capacidad = capacidad;
    }

    //Getters y Setters
    public int getNumero_Mesa() {
        return numero_Mesa;
    }
    public void setNumero_Mesa(int numero_Mesa) {
        this.numero_Mesa = numero_Mesa;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
