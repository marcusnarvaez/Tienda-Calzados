package Modelo;

public class Deportivo extends Calzado {

    //Atributos
    protected String tipoDeporte;

    protected String tipoMaterial;

    //metodos

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }


    //Constructor
    public Deportivo(Producto producto, String diaVenta, int numero, String tipoDeporte, String tipoMaterial) {
        super(producto, diaVenta, numero);
        this.tipoMaterial = tipoMaterial;
        this.tipoDeporte = tipoDeporte;
    }

    public int impuestoMaterial() {

        int impMaterial = -1;

        if (this.getTipoMaterial().equalsIgnoreCase("cuero")) {
            impMaterial = Math.round(this.getProducto().getValorBase() * 15 / 100);
            return impMaterial;
        } else if (this.getTipoMaterial().equalsIgnoreCase("lona")) {
            impMaterial = Math.round(this.getProducto().getValorBase() * 6 / 100);
            return impMaterial;
        }
        return impMaterial;
    }


    @Override
    public int totalPagar() {
        int total = -1;
        if (this.getProducto().getStock() > 0) {
            total = this.valorVenta() + impuestoMaterial() + impuestoIva();
            this.getProducto().setStock(this.getProducto().getStock() - 1);
            return total;
        } else {
            return total;
        }
    }
}