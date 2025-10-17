/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package restaurante;

/**
 *
 * @author expor
 */
public class Restaurante {

    public static void main(String[] args) {
        // Crear ingredientes
        Ingrediente queso = new Ingrediente("Queso", "200g");
        Ingrediente jamon = new Ingrediente("Jamón", "150g");
        Ingrediente masa = new Ingrediente("Masa", "1 unidad");
        Ingrediente salsa = new Ingrediente("Salsa de tomate", "100ml");
        Ingrediente carne = new Ingrediente("Carne de res", "200g");
        Ingrediente lechuga = new Ingrediente("Lechuga", "50g");
        Ingrediente tomate = new Ingrediente("Tomate", "2 rodajas");
        Ingrediente pan = new Ingrediente("Pan para hamburguesa", "1 unidad");
        
        // Crear platillos del menú
        Platillo pizza = new Platillo("Pizza Hawaiana", 180.0);
        pizza.agregarIngrediente(masa);
        pizza.agregarIngrediente(queso);
        pizza.agregarIngrediente(jamon);
        pizza.agregarIngrediente(salsa);
        
        Platillo hamburguesa = new Platillo("Hamburguesa Clásica", 120.0);
        hamburguesa.agregarIngrediente(pan);
        hamburguesa.agregarIngrediente(carne);
        hamburguesa.agregarIngrediente(queso);
        hamburguesa.agregarIngrediente(lechuga);
        hamburguesa.agregarIngrediente(tomate);
        
        Platillo ensalada = new Platillo("Ensalada César", 85.0);
        ensalada.agregarIngrediente(lechuga);
        ensalada.agregarIngrediente(queso);
        ensalada.agregarIngrediente(tomate);
        
        // Crear una mesa
        Mesa mesa1 = new Mesa(5, 4);  // Mesa 5 para 4 personas
        
        // Crear una comanda para la mesa
        Comanda comandaMesa5 = new Comanda(1001, mesa1);
        
        // Agregar platillos a la comanda
        comandaMesa5.agregarPlatillo(pizza);
        comandaMesa5.agregarPlatillo(hamburguesa);
        comandaMesa5.agregarPlatillo(ensalada);
        
        // Imprimir el ticket
        System.out.println("=== Sistema de Restaurante ===\n");
        comandaMesa5.imprimirTicket();
    }
}
