package topicos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        Clientes[] clientes = null;
        do {
            System.out.println("****** Menu Catalogo ******");
            System.out.println("1. Clientes");
            System.out.println("2. Productos");
            System.out.println("3. Proveedores");
            System.out.println("4. Ciudades");
            System.out.println("5. Estados");
            System.out.println("6. Reporte");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:  clientes = Clientes.datos(); break;
                case 2: Producto.datos(); break;
                case 3:  break;
                case 4:  break;
                case 5:  break;
                case 6: Clientes.imprimirD(clientes);  break;
                case 0: System.out.println("Saliendo del programa. ¡Adios!"); break;
                default: System.out.println("Upps! Intente nuevamente."); break;
            }
        } while (opc != 0);
        teclado.close();
    }
}