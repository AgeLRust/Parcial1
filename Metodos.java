import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<Vehiculo> CrearPila() {
        Stack<Vehiculo> pila = new Stack<>();
        for (int i = 0; i < 16; i++) {
            Vehiculo carrito = new Vehiculo();
            carrito.setDisponible(true);
            carrito.setModelo(null);
            carrito.setNombreP(null);
            carrito.setPlaca(null);
            carrito.setCilindraje(0);
            pila.push(carrito);

        
            
        }
        return pila;
    } 

    public void MostrarDisponible (Stack<Vehiculo> pila){
        int celda = 0;
        for (Vehiculo carrito : pila) {
            celda++;
            System.out.println("Celda " + celda);
            System.out.println(carrito.getDisponible());
            System.out.println(carrito.getModelo());
            System.out.println(carrito.getNombreP());
            System.out.println(carrito.getPlaca());
            System.out.println(carrito.getCilindraje());
            
        }
    }

    public void IngresarCarrito (Stack<Vehiculo> pila) {
        int icelda = 0;
        System.out.println("ingrese la celda donde quiere guardar su auto");
        icelda = sc.nextInt();
        int celda = 0;
        for (Vehiculo carrito : pila) {
            celda++;
            
            if (icelda == celda) {
                System.out.println("ingrese el modelo del carro");
                carrito.setModelo(sc.next());
                System.out.println("ingrese la placa del carro");
                carrito.setPlaca(sc.next());
                System.out.println("ingrese el nombre del propietario");
                carrito.setNombreP(sc.next());
                System.out.println("ingrese el cilindraje del carro");
                carrito.setCilindraje(sc.nextInt());
                carrito.setDisponible(false);

            }
        }

        MostrarDisponible(pila);

    }

    public void Desalojar (Stack<Vehiculo> pila) {
        int icelda = 0;
        System.out.println("ingrese la celda donde tiene su auto guardado");
        icelda = sc.nextInt();
        int celda = 0;
        for (Vehiculo carrito : pila) {
            celda++;
            
            if (icelda == celda) {
                carrito.setModelo(null);
                carrito.setPlaca(null);
                carrito.setNombreP(null);
                carrito.setCilindraje(0);
                carrito.setDisponible(true);

            }
        }

        MostrarDisponible(pila);

    }

        
    }