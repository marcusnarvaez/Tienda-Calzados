package Modelo;

public class Mujer extends Formal{

    //atributo

    public int alturaTaco;

    //metodos

    public int getAlturaTaco(){
        return alturaTaco;
    }

    public void setAlturaTaco(int setalturaTaco){
        this.alturaTaco = alturaTaco;
    }

    //constructor

    public Mujer(Producto producto, String diaVenta, int numero,String color, int alturaTaco){
        super(producto,diaVenta,numero, color);
        this.alturaTaco = alturaTaco;
    }


    @Override
    public int descuento() {
        int descuent2= 0;

        if (this.alturaTaco > 10){
            descuent2 = this.valorVenta()*20/100;
            return descuent2;
        }
        return descuent2;

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
