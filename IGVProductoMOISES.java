import java.util.Scanner;
public class IGVProductoMOISES {
    int cantidad;
    String producto;
    double precio;

    //construye ayudita jjejje
    public IGVProductoMOISES(int cantidad, String producto, double precioUnitario ){
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precioUnitario;
    }
    //calcula el total ayudita jjejje
    public double calcularTotal(){
        return cantidad * precio;
    }

    //calcula el IGV ayudita jjejje
    public double calcularIGV(){
        return calcularTotal() * 0.18;
    }

    //calcula el total a pagar ayudita jjejje
    public  double calcularTotalPagar(){
        return calcularTotal() + calcularIGV();
    }

    void verFactura(){

        double total = calcularTotal();
        double iva = calcularIGV();
        double totalAPagar = calcularTotalPagar();


        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░FACTURA DE COMPRA░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.printf("%-10s | %-13s | %-10s  | %-10s %n", "Cantidad", "Producto", "Precio Unit.", "total");
        System.out.printf("%-10d | %-13s | s/.%-10.2f | s/.%-10.2f %n", cantidad, producto, precio, total);
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.printf("%-33s | s/.%-10.2f %n", "Total", total);
        System.out.printf("%-33s | s/.%-10.2f %n", "IGV", iva);
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.printf("%-33s | s/.%-10.2f%n", "Total a Pagar", totalAPagar);
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad");
        int cantidad = input.nextInt();
        input.nextLine();
        System.out.println("ingrese el nombre del producto");
        String producto = input.nextLine();
        System.out.println("precio ");
        double precio = input.nextDouble();
        IGVProductoMOISES igv = new IGVProductoMOISES(cantidad,producto,precio);
        igv.verFactura();
    }

}
