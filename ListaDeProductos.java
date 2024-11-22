import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeProductos {
    Scanner input = new Scanner(System.in);
    void Categoriaslacteo(){
        List<Producto> listaProducto = new ArrayList<Producto>();
        listaProducto.add(new Producto("1. Gloria Reconstituida Entera (lata 400g)",5.50));
        listaProducto.add(new Producto("2. Gloria Reconstituida Entera (lata 170g)",2.50));
        listaProducto.add(new Producto("3. Gloria Sin Lactosa (lata 400g)",5.50));
        listaProducto.add(new Producto("4. Gloria Sin Lactosa (lata 170g)",2.50));
        listaProducto.add(new Producto("5. Gloria Niños (lata 400g)",5.50));
        listaProducto.add(new Producto("6. Gloria Niños (lata 170g)",2.50));
        listaProducto.add(new Producto("7. Gloria Evaporada Entera (lata 400g)",5.50));
        listaProducto.add(new Producto("8. Gloria Evaporada Entera (lata 170g)",2.50));
        listaProducto.add(new Producto("9. Bonle Cremosa (lata 400g)",5.50));
        listaProducto.add(new Producto("10. Bonle Cremosa (lata 170g)",2.50));
        listaProducto.add(new Producto("11.Bonle Punche (lata 400g)",5.50));
        listaProducto.add(new Producto("12. Bonle Punche (lata 170g)",2.50));
        listaProducto.add(new Producto("13. Gloria Entera      (caja 1L)",6.50));
        listaProducto.add(new Producto("14. Gloria Liht        (caja 1L)",6.50));
        listaProducto.add(new Producto("15. Gloria Sin Lactosa (caja 1L)",6.50));
        listaProducto.add(new Producto("16. Gloria chocolate   (caja 1L)",6.50));
        listaProducto.add(new Producto("17. Gloria Entera      (bolsa 900 ml)",5.00));
        listaProducto.add(new Producto("18. Gloria Liht        (bolsa 900 ml)",5.00));
        listaProducto.add(new Producto("19. Gloria Sin Lactosa (bolsa 900 ml)",5.00));
        listaProducto.add(new Producto("20. Gloria chocolate   (bolsa 900 ml)",5.00));
        listaProducto.add(new Producto("21. Chicolac Chocolatada UHT (caja 180 ml)",2.50));
        listaProducto.add(new Producto("22. Chicolac Chocolatada UHT (sachet 100 ml)",1.50));
        listaProducto.add(new Producto("23. Bonle chocolate   (bolsa 800 ml)",4.50));
        listaProducto.add(new Producto("24. Bonle Sin Lactosa (bolsa 800 ml)", 4.50));
        listaProducto.add(new Producto("25. Gloria Leche en Polvo (sachet 96g)",4.50));
        listaProducto.add(new Producto("26. Gloria Leche en Polvo (lata 800g)", 36.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){
            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    public  void comprarProducto(List<Producto> listaProducto) {

        System.out.println("\nIngrese el número del producto que desea comprar:");
        int numeroProducto = input.nextInt();
        if (numeroProducto > 0 && numeroProducto <= listaProducto.size()) {
            Producto productoSeleccionado = listaProducto.get(numeroProducto - 1);
            System.out.println("Ingrese la cantidad que desea comprar:");
            int cantidad = input.nextInt();
            IGVProductoMOISES igv = new IGVProductoMOISES(cantidad, productoSeleccionado.getProducto(), productoSeleccionado.getCosto());
            igv.verFactura();
            System.out.println("Metodo de pago tarjeta");
            pagotarjeta pagotarjeta = new pagotarjeta();
            pagotarjeta.Datos();
            pagotarjeta.pagotarjeta();
            pagotarjeta.Pagorealizado();
            System.exit(0);
        } else {
            System.out.println("Número de producto no válido.");
        }

    }
    void CategoriasDerivadosLacteos(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Yogurt Parcialmente Descremado (galonera 1.9 kg)",12.50));
        listaProducto.add(new Producto("2. Yogurt Parcialmente Descremado (botella 1 kg)",6.00));
        listaProducto.add(new Producto("3. Yogurt Parcialmente Descremado (botella 500 g)",3.00));
        listaProducto.add(new Producto("4. Yogurt Parcialmente Descremado (botella 180 g)",1.80));
        listaProducto.add(new Producto("5. Milkito Yogurt Bebible (galonera 1.9 kg)",4.50));
        listaProducto.add(new Producto("6. Milkito Yogurt Bebible (botella 1 kg)", 36.00));
        listaProducto.add(new Producto("7. Gloria Leche en Polvo (galonera 1.7 kg)",9.50));
        listaProducto.add(new Producto("8. Gloria Leche en Polvo (botella 1 kg)", 6.00));
        listaProducto.add(new Producto("9. Gloria Yogurt Frutado Fresa (vaso 120g)",4.50));
        listaProducto.add(new Producto("10. Gloria Yogurt Frutado Mango (vaso 120g)",3.50));
        listaProducto.add(new Producto("11. Gloria Griego Yogurt (bolsa 800g)",7.50));
        listaProducto.add(new Producto("12. Gloria Griego Yogurt (vaso 120g)",2.50));
        listaProducto.add(new Producto("13. Gloria Mantequilla (pote 390g)",17.50));
        listaProducto.add(new Producto("14. Gloria Mantequilla (pote 200g)",11.50));
        listaProducto.add(new Producto("15. Gloria Mantequilla (barra 200g)",11.00));
        listaProducto.add(new Producto("16. Gloria Mantequilla (barra 90g)",6.00));
        listaProducto.add(new Producto("17. Gloria Leche Condensada (doypack 200g)",6.50));
        listaProducto.add(new Producto("18. Gloria Leche Condensada (lata 390g)",8.00));
        listaProducto.add(new Producto("19. Bonle Quesos Adam    (500g)",20.50));
        listaProducto.add(new Producto("20. Bonle Quesos Cheddar (130g)",7.00));
        listaProducto.add(new Producto("21. Bonle Quesos natural (130g)",7.00));
        listaProducto.add(new Producto("22. Bonle Manjasblanco (sachet 500g)",9.50));
        listaProducto.add(new Producto("23. Bonle Manjasblanco (bolsa 200g)",6.00));
        listaProducto.add(new Producto("24. Bonle Manjasblanco (pote 250g)",6.50));
        listaProducto.add(new Producto("25. Gloria Crema de Leche (TIP 200g)",9.50));
        listaProducto.add(new Producto("26. Gloria Crema de Leche (bolsa 900g)",26.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){
            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    void CategoriasAlimentos(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Gloria Mermelada (pote 320g)",4.50));
        listaProducto.add(new Producto("2. Gloria Mermelada (vaso 310g)",7.00));
        listaProducto.add(new Producto("3. Gloria Mermelada (barril 1 kg)",14.50));
        listaProducto.add(new Producto("4. Gloria Mermelada (sachet 100g)",2.00));
        listaProducto.add(new Producto("5. Gloria Mermelada (frasco 200g)",4.50));
        listaProducto.add(new Producto("6. Gloria Paneton Tradicional (bolsa 900g)",23.50));
        listaProducto.add(new Producto("7. Gloria Paneton Tradicional (lata 900g)",30.00));
        listaProducto.add(new Producto("8. Gloria Paneton Tradicional (caja 900g)",26.00));
        listaProducto.add(new Producto("9. Filete de Atún en Agua y Sal GLORIA     (Lata 140g)",6.50));
        listaProducto.add(new Producto("10. Trozos de Atún en Aceite Vegetal GLORIA (Lata 140g)",5.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){
            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    void CategoriasBebidas() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Bebida GLORIA Naranja  (Caja 1L)",4.00));
        listaProducto.add(new Producto("2. Bebida GLORIA Mango    (Caja 1L)",4.00));
        listaProducto.add(new Producto("3. Bebida GLORIA Piña     (Caja 1L)",4.00));
        listaProducto.add(new Producto("4. Bebida GLORIA Maracuya (Caja 1L)",4.00));
        listaProducto.add(new Producto("4. Bebida GLORIA Durazno  (Caja 1L)",4.00));
        listaProducto.add(new Producto("4. Refresco GLORIA Chicha Morada Casera (Botella 3L)",7.50));
        listaProducto.add(new Producto("4. Refresco GLORIA Chicha Morada Casera (Botella 400 ml)",1.80));
        listaProducto.add(new Producto("4. TAMPICO Citrus Punch  (Botella 3L)",7.50));
        listaProducto.add(new Producto("4. TAMPICO Citrus Punch  (Botella 1.5L)",4.00));
        listaProducto.add(new Producto("4. TAMPICO Citrus Punch  (Botella 500 ml)",2.00));
        listaProducto.add(new Producto("4. Shake Mocaccino UHT GLORIA  (Botella 320ml)",3.50));
        listaProducto.add(new Producto("4. Shake Capuccino UHT GLORIA  (Botella 320ml)",3.50));
        listaProducto.add(new Producto("4. Shake Chocolate UHT GLORIA  (Botella 320ml)",3.50));
        listaProducto.add(new Producto("4. Agua Pura Vida  (botella 3L )",6.50));
        listaProducto.add(new Producto("4. Agua Pura Vida  (botella 500 ml)",1.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){
            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    String FINAL(){
        return "Gracias por la compra";
    }
    public static void main(String[] args) {
ListaDeProductos categorias = new ListaDeProductos();
categorias.Categoriaslacteo();
    }
    public static class MOISES {
        String correo, contraseña, nombre, apellido, dni, telefono;
        ListaDeProductos lita1 = new ListaDeProductos();
    List<Producto> listaProducto = new ArrayList<Producto>();
        public void gloria() {
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░ Ｂｉｅｎｖｅｎｉｄｏｓ ａ Ｇｌｏｒｉａ ░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        }

        public void Menu() {

            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░1.░░░░░░░░░░░░░░░░░░░░░░producto ░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░2.░░░░░░░░░░░░░░░░░░tienda online░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        }
        public void menu2() {
            Scanner ardilla = new Scanner(System.in);
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("Elija una de las opciones");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            int opc = ardilla.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░1.░░░░░░░░░░░░░░░░░░░░░░░░ Lacteos ░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░2.░░░░░░░░░░░░░░░░░░░Derivados Lacteos░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░3.░░░░░░░░░░░░░░░░░░░░░░Alimentos░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░4.░░░░░░░░░░░░░░░░░░░░░░░░Bebidas░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    int opc_cat = ardilla.nextInt();
                    switch (opc_cat) {
                        case 1:
                            lita1.Categoriaslacteo();
                            lita1.comprarProducto(listaProducto);
                        case 2:
                            lita1.CategoriasDerivadosLacteos();
                            lita1.comprarProducto(listaProducto);
                        case 3:
                            lita1.CategoriasAlimentos();
                            lita1.comprarProducto(listaProducto);
                        case 4:
                            lita1.CategoriasBebidas();
                            lita1.comprarProducto(listaProducto);
                        default:
                            System.out.println("Opcion no disponible");
                            break;
                    }
                    break;
                case 2:
                    COMPRA_ONLINE huevos1 = new COMPRA_ONLINE();
                    huevos1.adrian();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        public static void main(String[] args) {
            MOISES moi = new MOISES();
            moi.gloria();
            moi.Menu();
            moi.menu2();
        }
    }
}
