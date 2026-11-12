package pg.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.paquete.componente.Auditoria;
import pg.edu.uce.pa.paquete.componente.Pedido;
import pg.edu.uce.pa.paquete.extensiones.DescuentoNormal;
import pg.edu.uce.pa.paquete.extensiones.DescuentoPreferencial;
import pg.edu.uce.pa.paquete.extensiones.DescuentoVIP;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Auditoria auditoria;

    @Inject
    DescuentoNormal descuentoNormal;

    @Inject
    DescuentoVIP descuentoVIP;

    @Inject
    DescuentoPreferencial descuentoPreferencial;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("INICIO_EVALUACION");

        Pedido pedido1 = new Pedido("P001", "Laptop", 1000.00, "VIP");

        Pedido pedido2 = new Pedido("P002", "Mouse", 100.00, "NORMAL");

        Pedido pedido3 = new Pedido("P003", "Teclado", 200.00, "PREFERENCIAL");

        auditoria.Auditar(pedido1, descuentoVIP);
        auditoria.Auditar(pedido2, descuentoNormal);
        auditoria.Auditar(pedido3, descuentoPreferencial);

        System.out.println();
        System.out.println("FIN_EVALUACION");

        System.out.println("172219-pg");

        return 0;

    }

}
