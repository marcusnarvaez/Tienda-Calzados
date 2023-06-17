package Modelo;


public abstract class Formal extends Calzado{

    //Atributo
    protected String color;

    //metodos

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //constructor
    public Formal(Producto producto, String diaVenta, int numero, String color) {
        super(producto, diaVenta, numero);
        this.color = color;
    }

    public int impuestoEspecifico(){
        int impEspecifico;

        impEspecifico = (int) Math.round(this.getProducto().getValorBase()*7.4/100);
        return  impEspecifico;
    }

    public abstract int descuento();


}
