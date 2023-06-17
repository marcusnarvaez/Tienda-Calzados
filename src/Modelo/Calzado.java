package Modelo;

public abstract class Calzado {

    //atributos

    //Producto, día de venta, número

    protected Producto producto;

    protected String diaVenta;

    protected int numero;


    //metodos

   public Producto getProducto(){
       return producto;
   }


    public void setProducto(Producto producto) {
        this.producto = producto;
    }

public String getDiaVenta(){
       return diaVenta;
}

public void setDiaVenta(String diaVenta){
      this.diaVenta = diaVenta;
}

public int getNumero(){
       return numero;
}

public void setNumero(int numero){
       this.numero = numero;
}

//constructor
    public Calzado(Producto producto, String diaVenta, int numero){
       this.producto = producto;
       this.diaVenta = diaVenta;
       this.numero = numero;
    }

    public Calzado(){

    }

    public int valorVenta(){
      int valorVenta= -1;

      if(this.getDiaVenta().equalsIgnoreCase("semana")){
          //-15%
          valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
           return  valorVenta;
      }else if (this.getDiaVenta().equalsIgnoreCase("Fin de semana")){
          // +24%
          valorVenta = this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*24/100);
           return valorVenta;
      }
      return valorVenta;
    }

    public int impuestoIva(){
       int impuestoIva;

       impuestoIva = this.valorVenta()*19/100;

       return impuestoIva;
    }

    public abstract int totalPagar();
}
