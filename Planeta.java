public class Planeta{
    String nombre;
    int cantidadSatelites;
    double masa, volumen, diametro, distanciaSol;
    boolean observacion;
    double densidad;
    

    

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro,
            double distanciaSol, boolean observacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observacion = observacion;
    }

    public void imprimirAtributos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + "kg");
        System.out.println("Volumen:  " + volumen + "km^3");
        System.out.println("Diametro: "  + diametro + "km");
        System.out.println("Distancia al sol: " + distanciaSol + "km");
        System.out.println("Es observable: " +  observacion);

    }
    
    public double calcularDensidad(){
      return masa / volumen;
    }

}