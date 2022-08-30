package mundopc;

import co.com.sm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP= new Monitor("HP", 13.4);
        Raton ratonHP = new Raton("USB", "HP");
        Teclado tecladoHP = new Teclado("USB", "HP");
        Computadora computadorHP = new Computadora("AO1282 HP", monitorHP, tecladoHP, ratonHP);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorHP);
        orden1.mostrarOrden();
    }
}
