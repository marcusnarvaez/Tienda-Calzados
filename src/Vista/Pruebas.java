/*package Vista;

import Controlador.TiendaCalzado;
import Modelo.*;

import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {

        //Producto producto = new Producto("1",8, 455);//objeto vacio por que se construye con constructor vacio
       // Deportivo deportivo = new Deportivo(new Producto("1", 22, 210000),"semana",43, "basquet", "cuero");
        //Calzado calzado = new Calzado(new Producto("3",2, 10000),"fin de semana", 38);
        Hombre hombre = new Hombre(new Producto("32", 34,100000), "semana",44,"Rojo");
        //Hombre hombre2 = new Hombre(new Producto("329", 374,170000), "semana",44,"Verde");
        Mujer mujer2 = new Mujer(new Producto("1049",1,100000),"semana", 38,"rosa", 49);
        Deportivo deportivo2 = new Deportivo(new Producto("15", 2, 10000),"semana",43, "basquet", "cuero");
        Mujer calzadoMujer = new Mujer(new Producto("109",1,10000),"semana", 38,"rosa", 11);
        //un constructor es un metodo enJava para instanciar
        // objetos (Java lo crea por nosotros sino lo construimos)




        System.out.println("El stock es " + producto.getStock());
        System.out.println("El valor del impuesto especifico es " + mujer.impuestoEspecifico());
        System.out.println("El valor de venta es " + mujer.valorVenta());
        System.out.println("El valor del IVA es " + mujer.impuestoIva());
        System.out.println("El descuento por altura de taco es " + mujer.descuento());
        System.out.println("El total a pagar es " + mujer.totalPagar());
        System.out.println("El nuevo stock es " + mujer.getProducto().getStock());

        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());

        //tienda.ingresarCalzadoDeportivo(deportivo);
        tienda.ingresarCalzadoMujer(calzadoMujer);
       // tienda.ingresarCalzadoHombre(hombre);
       // tienda.ingresarCalzadoHombre(hombre2);
        tienda.ingresarCalzadoDeportivo(deportivo2);
       tienda.ingresarCalzadoMujer(mujer2);
        System.out.println("El largo del arreglo es " + tienda.getTienda().size());
        System.out.println(tienda.calzadoMujer());
        System.out.println(tienda.valorVenta("109"));
        System.out.println(tienda.calzadoTop());
        System.out.println("El total de descuentos es: "+tienda.totalDescuentos());

    }
}
*/