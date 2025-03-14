import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Metodos m = new Metodos();
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        Stack<Vehiculo> pila = m.CrearPila();
        int opt = 0;
        while (continuar) {
            System.out.println("¿Qué desea realizar?  1:Consultar Disponibilidad   2: Ingresar Vehiculo  3:Sacar un vehiculo  Cualquier otro número para salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                m.MostrarDisponible(pila);
                    break;
                case 2: 
                m.IngresarCarrito(pila);
                    break;
                case 3:
                m.Desalojar(pila);
                default:
                System.out.println("Vuelva Pronto");
                    break;
            }
        }
    }
 }