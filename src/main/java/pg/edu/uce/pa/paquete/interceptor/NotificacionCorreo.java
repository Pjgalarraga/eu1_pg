package pg.edu.uce.pa.paquete.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pg.edu.uce.pa.paquete.componente.Pedido;

@Notificacion 
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION)
public class NotificacionCorreo {

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {
      
        Pedido pedido = (Pedido) context.getParameters()[0];
        
       Long inicio = System.currentTimeMillis();
       Object ejecucion = context.proceed();
       Long fin = System.currentTimeMillis();

       
         System.out.println("NOTIFIACION[CORREO]:" + pedido.getCodigo());
       System.out.println("DURACION:" +pedido.getCodigo() + "|MS:" + (fin-inicio));
       System.out.println("TIEMPO:"+pedido.getCodigo() + "|OK");


       


        return ejecucion;

    }


}
