package Vista;

import Controlador.TiendaCalzado;
import Modelo.Deportivo;
import Modelo.Hombre;
import Modelo.Mujer;
import Modelo.Producto;

import java.util.ArrayList;

public class App {

    public  static int menu(){//en este metodo se definira el menu de la app
        System.out.println("------------Tienda Calzado V1.0------------");
        System.out.println("\t1.Ingresar ");
        System.out.println("\t2.Mostrar sólo los calzado de mujer");
        System.out.println("\t3.Valor Venta");
        System.out.println("\t4.Calzados Top");
        System.out.println("\t5.Total Impuestos Específicos");
        System.out.println("\t6.Total Descuento");
        System.out.println("\t7.Salir");
        System.out.println("-------------------------------------------");
        System.out.println("Por favor ingresar una opción para continuar...");
        return Leer.datoInt();
    }

    public static void main(String[] args){
        int opcion;
        String codigoCalzado;

        //instanciar coleccion
        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());//coleccion vacia

        do {
            opcion = menu();


            switch (opcion){
                case 1:
                    codigoCalzado = pideCodigo();//se obtiene el codigo
                    if (tienda.buscarCalzado(codigoCalzado)==-1){
                        //calzado no existe
                        System.out.println("Ingresar stock del calzado: "); int stock = Leer.datoInt();
                        System.out.println("Ingresar valor base del calzado: "); int valorbase = Leer.datoInt();
                        System.out.println("Ingresar numero de calzado: "); int numero = Leer.datoInt();

                        String diaVenta;
                                do{
                                    System.out.println("Ingrese dia de venta (Semana o Fin de Semana): ");
                                    diaVenta = Leer.dato();//Semana
                                }while (diaVenta.compareToIgnoreCase("Semana") !=0 &&
                                        diaVenta.compareToIgnoreCase("Fin de Semana") !=0);

                                int respuesta;
                                do {
                                    System.out.println("El calzado es: 1)Deportivo  2)Formal Hombre  3)Formal Mujer");
                                    System.out.println("Ingrese una opcion para continuar: ");
                                    respuesta = Leer.datoInt();
                                }while (respuesta<1 || respuesta>3);

                                if (respuesta==1){
                                    //calzado deportivo
                                    System.out.println("Ingresar tipo de deporte: "); String tipoDeporte = Leer.dato();

                                    String tipoMaterial; //cuero o lona
                                    do {
                                        System.out.println("Ingrese tipo de material (Cuero o Lona): ");
                                        tipoMaterial = Leer.dato();
                                    }while(tipoMaterial.compareToIgnoreCase("Cuero")!=0 &&
                                           tipoMaterial.compareToIgnoreCase("Lona")!=0);

                                    tienda.ingresarCalzadoDeportivo(new Deportivo(new Producto(codigoCalzado,stock,valorbase),diaVenta,numero,tipoDeporte,tipoMaterial));
                                    System.out.println("Se agrega calzado deportivo correctamente");
                                }else {
                                    System.out.println("Ingrese el color: ");String color = Leer.dato();

                                    if (respuesta==2){//hombre
                                       tienda.ingresarCalzadoHombre(new Hombre(new Producto(codigoCalzado,stock,valorbase),diaVenta,numero,color));
                                        System.out.println("Se agrega calzado de Hombre correctamente");
                                    }else {//Mujer
                                        System.out.println("Ingresar altura de taco: "); int alturaTaco = Leer.datoInt();
                                        tienda.ingresarCalzadoMujer(new Mujer(new Producto(codigoCalzado,stock,valorbase),diaVenta,numero,color, alturaTaco));
                                        System.out.println("Se agrega calzado de Mujer correctamente");
                                    }
                                }

                    }else {
                        System.out.println("Calzado con codigo " + codigoCalzado + "ya se encuentra almacenado");
                    }
                    break;
                case 2:
                    if(tienda.getTienda().size()==0){
                        System.out.println("Registre calzados en la tienda para continuar");
                    }else {
                        System.out.println(tienda.calzadoMujer());
                    }
                    break;
                case 3:
                    if (tienda.getTienda().size()==0){
                        System.out.println("Registre calzados en la tienda para continuar");
                    }else {
                        String codigoABuscar =pideCodigo();
                        System.out.println(tienda.valorVenta(codigoABuscar));
                    }
                    break;
                case 4:
                    System.out.println(tienda.calzadoTop());
                    break;
                case 5:
                    System.out.println("El total de impuestos especificos si se vendieran todos los calzados es: $"
                    + tienda.impEspecifico());
                    break;
                case 6:
                    System.out.println("El total de descuentos es: $"
                            + tienda.totalDescuentos());
                    break;
                case 7:
                    break;
            }

        }while (opcion!=7);
    }

    public  static  String pideCodigo(){
        System.out.println("Ingresar el codigo del calzado(Ej. 123ABC9");
        return Leer.dato();
    }

}