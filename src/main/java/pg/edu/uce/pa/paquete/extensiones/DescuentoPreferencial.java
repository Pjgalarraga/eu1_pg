package pg.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoPreferencial implements Descuento{


    @Override
    public double aplicar(double monto) {

        System.out.println("Los clientes preferenciales reciben un descuento del 15%");
    
        double descuento = monto * 0.15;

        return monto - descuento;
    
    }

}
