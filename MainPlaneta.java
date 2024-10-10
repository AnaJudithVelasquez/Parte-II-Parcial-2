
public class MainPlaneta {
    public static void  main(String[] args) {
         Planeta tierra = new Planeta ("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        
         tierra.imprimirAtributos();
         System.out.println("Densidad de la tierra: " + tierra.calcularDensidad() + " kg/km^3");
       

        Planeta jupiter = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        
        jupiter.imprimirAtributos();
        System.out.println("Densidad de Jupiter: " + jupiter.calcularDensidad() + " kg/km^3");
      
  }
}
