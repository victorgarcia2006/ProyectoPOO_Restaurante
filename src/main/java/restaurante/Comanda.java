package restaurante;

public class Comanda {
    private int idComanda;
    private Mesa mesa;
    private Platillo[] platillos;

    // Constructor
    public Comanda(int idComanda, Mesa mesa){
        this.idComanda = idComanda;
        this.mesa = mesa;
        this.platillos = new Platillo[20]; // Inicializamos el arreglo con espacio para 20 platillos
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public Platillo[] getPlatillos() {
        return platillos;
    }
    public void setPlatillos(Platillo[] platillos) {
        this.platillos = platillos;
    }
    public void agregarPlatillo(Platillo platillo){
        for(int i = 0; i<platillos.length;i++){
            if(platillos[i]==null){
                platillos[i]=platillo;
                break;
            }
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i =0;i<platillos.length;i++){
            if(platillos[i]!=null){
                total += platillos[i].getPrecio();
            }
        }
        return total;
    }
    public void imprimirTicket(){
        System.out.println("******************************");
        System.out.println("      Ticket de consumo       ");
        System.out.println("******************************");
        System.out.println();
        System.out.println("--- Datos de la Mesa ---");
        System.out.println("Numero de Mesa: "+mesa.getNumero_Mesa());
        System.out.println();
        System.out.println("--- Platillos Ordenados ---");
        for(int i=0; i<platillos.length;i++){
            if(platillos[i]!=null){
                System.out.println((i+1)+". Platillo: "+platillos[i].getNombre());
                System.out.println("Precio: $"+platillos[i].getPrecio());
            }
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Subtotal: $"+calcularTotal());
        System.out.println("Propina Sugerida (10%): $"+(calcularTotal()*0.1));
        System.out.println("------------------------------");
        System.out.println("TOTAL A PAGAR: $"+(calcularTotal()*1.1));
        System.out.println("------------------------------");

    }

}
