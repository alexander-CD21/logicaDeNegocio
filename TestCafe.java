import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
    CafeUtil appTest = new CafeUtil();
    /* 
      Necesitarás agregar 1 línea a este archivo para crear una instancia
      de la clase CafeUtil.
      Sugerencia: deberás corresponder con el nombre de la variable que se usa a continuación.
    */

    	
        /* ============ Casos de prueba de la App ============= */
    
        System.out.println("\n----- Prueba Meta café -----");
        System.out.printf("Compras necesarias para la semana 10: %s \n\n", appTest.getStreakGoal(10));
    
         System.out.println("----- Prueba Total Orden -----");
         double[] lineItems = {3.5, 1.5, 4.0, 4.5};
         System.out.printf("Total orden: %s \n\n",appTest.getOrderTotal(lineItems));
        
         System.out.println("----- Prueba Mostrar Menú-----");
        
         ArrayList<String> menu = new ArrayList<String>();
         menu.add("cafe de goteo");
         menu.add("capuchino");
         menu.add("latte");
         menu.add("moka");
         appTest.displayMenu(menu);
    
         System.out.println("\n----- Prueba acgregar cliente-----");
         ArrayList<String> customers = new ArrayList<String>();
         // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
             appTest.addCustomer(customers);
             System.out.println("\n");
         }
        appTest.printPriceChar("Cafe molido",12000,4);
        appTest.printPriceChar("Capuchino",2600,1);
        appTest.printPriceChar("latte",3200,1);
        appTest.printPriceChar("cafe de goteo",2900,1);
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1200.0);
        prices.add(2600.0);
        prices.add(3200.0);
        prices.add(4900.0);
        appTest.displayMenu(menu,prices);
        ArrayList<String> customers1 = new ArrayList<String>();
        appTest.addCustomer1(customers1);
    }
}