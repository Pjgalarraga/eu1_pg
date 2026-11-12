package pg.edu.uce.pa.paquete.componente;

public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
   
    private String Cliente;


    public Pedido(String codigo, String producto, double valorOriginal, String cliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
       
        Cliente = cliente;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getProducto() {
        return producto;
    }


    public void setProducto(String producto) {
        this.producto = producto;
    }


    public double getValorOriginal() {
        return valorOriginal;
    }


    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }


    public String getCliente() {
        return Cliente;
    }


    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    

    

}
