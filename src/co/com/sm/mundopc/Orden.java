package co.com.sm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadoresOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden= ++Orden.contadoresOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Has superado el limite de " + Orden.MAX_COMPUTADORAS + " computadoras.");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("ORDEN #" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
