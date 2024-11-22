import java.util.HashMap;
import java.util.Scanner;

public class moises1 {

    private HashMap<String, String> usuarios = new HashMap<>();

    public moises1() {
        usuarios.put("moises", "12345");
        usuarios.put("moises1", "12345");
        usuarios.put("moises3", "12345");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░ Ｂｉｅｎｖｅｎｉｄｏｓ ａ Ｇｌｏｒｉａ ░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░ Ｇｌｏｒｉａ ░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░1░░░░░░░░░░░░░░░░ Ｉｎｉｃｉａｒ ｓｅｓｉｏｎ ░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░2░░░░░░░░░░░░░░░░░░ Ｃｒｅａｒ Ｃｕｅｎｔａ ░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░0░░░░░░░░░░░░░░░░░░░░░░░░░░ SALIR ░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (iniciarSesion(scanner)) {
                        continuar = false;
                    }
                    break;
                case 2:
                    crearCuenta(scanner);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░Gracias Hasta luego░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
                default:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░░Opción no válida. Por favor, inténtelo de nuevo.░░░░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
            }
        }
    }

    private boolean iniciarSesion(Scanner scanner) {
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░Ｉｎｇｒｅｓｅ Ｎｏｍｂｒｅｓ░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        String usuario = scanner.nextLine();
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░Ｉｎｇｒｅｓｅ ｃｏｎｔｒａｓｅñａ░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        String contraseña = scanner.nextLine();

        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░ Ｂｉｅｎｖｅｎｉｄｏｓ ａ Ｇｌｏｒｉａ ░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░ Ｇｌｏｒｉａ ░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            return true;
        } else {
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░Ｃｏｎｔｒａｓｅñａ o usuario no ｖａｌｉｄａ░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            return false;
        }
    }

    private void crearCuenta(Scanner scanner) {
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░Ｉｎｇｒｅｓｅ Ｎｏｍｂｒｅｓ░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        String nuevoUsuario = scanner.nextLine();

        if (usuarios.containsKey(nuevoUsuario)) {
            System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro nombre de usuario.");
        } else {
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░Ｉｎｇｒｅｓｅ ｕｎａ ｃｏｎｔｒａｓｅñａ░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            String nuevaContraseña = scanner.nextLine();
            usuarios.put(nuevoUsuario, nuevaContraseña);
            System.out.println("Cuenta creada");
            iniciarSesionAutomatica(nuevoUsuario, nuevaContraseña);
        }
    }

    private void iniciarSesionAutomatica(String usuario, String contraseña) {
        if (verificarCredenciales(usuario, contraseña)) {

            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░ Ｂｉｅｎｖｅｎｉｄｏｓ ａ Ｇｌｏｒｉａ ░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        } else {
            System.out.println("Error al iniciar sesión ");
        }
    }

    private boolean verificarCredenciales(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }

    public static void main(String[] args) {
        moises1 GLORIA = new moises1();
        GLORIA.iniciar();
    }
}
