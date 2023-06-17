package Modelo;

public class Producto{

    //Atributos
    private String codigo;

    private int stock;

    private  int valorBase;


    //Metodos
    // tienen modificador de acceso, tipo de dato, nombre (argumentos){
    //           cuerpo del metodo (aqui escribimos la logica)
    //
    // }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    //constructor
    //es un metodo para crea un objeto (java nos crea el constructor solo, sino lo hacemos nosotros)



    public Producto(String codigo, int stock, int valorBase) {
        this.codigo = codigo;
        this.stock = stock;
        this.valorBase = valorBase;
    }
}
