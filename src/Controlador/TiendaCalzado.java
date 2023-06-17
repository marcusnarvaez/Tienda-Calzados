package Controlador;

import Modelo.Calzado;
import Modelo.Deportivo;
import Modelo.Hombre;
import Modelo.Mujer;

import  java.util.ArrayList;

public class TiendaCalzado {

    //Atributos

    private ArrayList<Calzado> tienda; //(calzado,calzado,calzado,calzado,calzado)
                                       //(deportivo,mujer,hombre,deportivo,deportivo)

    //metodos

    public ArrayList<Calzado> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    //constructor
    public TiendaCalzado(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    //Logica de la aplicacion

    public int buscarCalzado(String codigo){
        for (int i=0; i<tienda.size();i++){
            if (tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigo)==0){
                //encontre el calzado
                return i; //posicion del calzado encontrado
            }
        }
      return -1;//no existe el codigo asociado al calzado
    }

    //opcion 1 ingresar calzado

    public void ingresarCalzadoDeportivo(Deportivo deportivo){
        if (this.buscarCalzado(deportivo.getProducto().getCodigo())==-1){
            tienda.add(deportivo);
        }
    }

    public void ingresarCalzadoMujer(Mujer mujer){
        if (this.buscarCalzado(mujer.getProducto().getCodigo())==-1){
            tienda.add(mujer);
        }
    }

    public void ingresarCalzadoHombre(Hombre hombre){
        if (this.buscarCalzado(hombre.getProducto().getCodigo())==-1){
            tienda.add(hombre);
        }
    }

    //opcion 2 mostrar calzado de mujer
    //mostrar dia de venta, altura de taco y descuento

    public String calzadoMujer(){
        String mensaje = "";
        Mujer mujer=null;
        for (int i=0; i<tienda.size(); i++){
            if (tienda.get(i) instanceof Mujer){
                mujer = (Mujer)tienda.get(i);
                mensaje = mensaje + "\nDia de venta :"+ mujer.getDiaVenta()+ ", altura de taco :"+mujer.getAlturaTaco()+
                        " y descuento : $"+mujer.descuento();
            }
        }
        return mensaje;
    }

//opcion 3 mostrar valor de venta y numero de un calzado en particular

    public String valorVenta(String codigo){
        for (int i=0; i<tienda.size();i++){
            if(tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigo)==0){
                //encontre el producto
                return "El valor de venta del calzado es: $"+tienda.get(i).valorVenta() +
                        " y el numero es: "+tienda.get(i).getNumero();
            }
        }
        return "El codigo "+ codigo +" ingresado no pertenece a un calzado registrado";
    }

    //opcion 4 calzado top valor > 80000

    public String calzadoTop(){
        int cantidad=0;
        for (int i=0; i< tienda.size();i++){
            if (tienda.get(i).getProducto().getValorBase()>80000){
                cantidad = cantidad + tienda.get(i).getProducto().getStock();

            }

        }
        return "La Cantidad de calzados Top son: "+ cantidad;
    }

//opcion 5 total impuestos especificos
    //mostrara el total de impuestos especificos si se vendieran todos los calzados

    public  int impEspecifico(){
        int total = 0;
        Mujer mujer = null;
        Hombre hombre = null;
        for (int i=0; i< tienda.size();i++){
            if (tienda.get(i) instanceof Hombre){
                //encotre el producto de hombre
                hombre = (Hombre)tienda.get(i);
               total = total + hombre.impuestoEspecifico()*hombre.getProducto().getStock();

            } else if (tienda.get(i)instanceof Mujer) {
                //encontre el producto de mujer
                mujer = (Mujer)tienda.get(i);
                total = total + mujer.impuestoEspecifico()*mujer.getProducto().getStock();

            }
        }
        return total;
    }

    //opcion 6 total de descuentos
    //mostrara el total de descuentos de la tienda

    public int totalDescuentos(){
        int total2 = 0;
        Mujer mujer = null;
        Hombre hombre = null;

        for (int i=0;i< tienda.size();i++){
            if (tienda.get(i) instanceof Hombre){
                //encontre el producto de hombre
                hombre = (Hombre)tienda.get(i);
                total2 = total2 + (hombre.descuento()*hombre.getProducto().getStock());

            } else if (tienda.get(i) instanceof Mujer) {
                //encontre el producto de mujer
                mujer = (Mujer)tienda.get(i);
                total2 = total2 + (mujer.descuento()*mujer.getProducto().getStock());
            }
        }
        return total2;
    }
}
