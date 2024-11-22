import java.util.Scanner;
public class COMPRA_ONLINE {
    public static   void main (String[]args){
        COMPRA_ONLINE GLOGLO = new COMPRA_ONLINE();
        GLOGLO.adrian();
    }
    void adrian(){
        Scanner MIAU = new Scanner(System.in);
        int opcionSeleccionado;


        do {
            System.out.println("░░HOLA░░Ｂｉｅｎｖｅｎｉｄｏｓ░ａ░Ｇｌｏｒｉａ░░░COMPRA ONLINE░░");
            System.out.println("1 llamada");
            System.out.println("2 compras por whatsapp");
            System.out.println("3 salir");
            opcionSeleccionado = MIAU.nextInt();
            switch (opcionSeleccionado) {
                case 1:
                    System.out.println("seleccionastes la primera 1ra opcion llamando  941409113");
                    System.out.println("1 quieres realizar pedido  ");
                    System.out.println("2 para recibir ayuda de compra");
                    int subopcion1 = MIAU.nextInt();
                    if (subopcion1 == 1) { //poner sub opciones.
                        System.out.println(" puedes realizar cualquier pedido mediante este link https://www.gloria.com.pe/Site/noticias_detalle/tus-pedidos-en-un-click  ");
                    } else if (subopcion1 == 2) {
                        System.out.println(" acontinuacion se le cotactara un ayudante para ayudarle con su pedido");
                    } else {
                        System.out.println("opcion no valida");
                    }
                    break;
                case 2:
                    System.out.println(" seleccionaste la 2da opcion para compras por whatsapp");
                    System.out.println("selecciona 1 consultar  de productos por llamada ");
                    System.out.println("seleccione 2 comprar productos ahora ");
                    System.out.println("selecciona 3 otras consultas");
                    int subopcion2 = MIAU.nextInt();
                    if (subopcion2 == 1) {
                        System.out.println("De pocos segundo le llamaremos y prodra hacer su consulta por llamada ");
                    } else if (subopcion2 == 2)
                        System.out.println("Te proporcionamos un link de nuestros productos ->  https://www.gloria.com.pe/Site/noticias_detalle/tus-pedidos-en-un-click");
                    else if (subopcion2 == 3){
                        System.out.println("para poder ayudarle llamar al numero (01) 000 0000 ");
                    }
                    else {
                        System.out.println("opcion no valida");

                    }
                    break;
                case 3:
                    System.out.println(" has seleccionado la opcion 4: salir");
                    break;
                default:
                    System.out.println("opcion del 1 al 3 ");
            }
        }while (opcionSeleccionado != 3) ;
    }
}
