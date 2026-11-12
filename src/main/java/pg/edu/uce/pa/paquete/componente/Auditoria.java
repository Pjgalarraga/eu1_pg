package pg.edu.uce.pa.paquete.componente;

import jakarta.enterprise.context.ApplicationScoped;
import pg.edu.uce.pa.paquete.extensiones.Descuento;
import pg.edu.uce.pa.paquete.interceptor.Notificacion;

@ApplicationScoped 
public class Auditoria {

    @Notificacion
    public void Auditar(Pedido pedido, Descuento descuento) {
        System.out.println("-------------------------------------------------------------------");

        pedido.setValorOriginal(descuento.aplicar(pedido.getValorOriginal()));

        System.out.println("PEDIDO:" + pedido.getCodigo() + "|TOTAL:" + pedido.getValorOriginal());

      
    }

}
