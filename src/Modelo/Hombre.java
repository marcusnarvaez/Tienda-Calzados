package Modelo;

public class Hombre extends Formal{

    //atributos

//constructor
    public Hombre(Producto producto, String diaVenta, int numero, String color) {
        super(producto, diaVenta, numero, color);
    }

    @Override
    public int descuento() {
        int descuent= 0;

        if (this.getColor().equalsIgnoreCase("rojo")||this.getColor().equalsIgnoreCase("verde")){
            descuent = this.valorVenta()*25/100;
            return descuent;
        }
        return descuent;
    }


    @Override
    public int totalPagar() {// valor venta + impuestoIva - descuento + impuestoEspecifico
        int total = -1;
        if (this.getProducto().getStock()>0){

            total = this.valorVenta()+impuestoIva()-descuento()+ impuestoEspecifico();
            this.getProducto().setStock(this.getProducto().getStock()-1);
            return total;
        }else {
            return total;
        }

    }
}
