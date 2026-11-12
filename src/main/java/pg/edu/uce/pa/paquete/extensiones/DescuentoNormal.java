package pg.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoNormal implements Descuento{

    @Override
    public double aplicar(double monto) {
        System.out.println("Los clientes normales no tienen descuento");
    
        return monto;
    
    }
    

}
