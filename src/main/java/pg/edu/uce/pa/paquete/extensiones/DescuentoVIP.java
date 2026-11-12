package pg.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements Descuento{


    @Override
    public double aplicar(double monto) {

        System.out.println("Los clientes vip reciben un descuento del 10%");
    
        double descuento = monto * 0.10;

        return monto - descuento;
    
    }
    

}
