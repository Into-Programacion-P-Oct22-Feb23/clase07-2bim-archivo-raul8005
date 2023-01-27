/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);

    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese nombre de paises:   ");
            String paises = entrada.nextLine();

            arreglo2.add(paises);

            System.out.println("Ingrese el numero 2 para salir");
            int opcion2 = entrada.nextInt();

            entrada.nextLine();

            if (opcion2 == 2) {
                bandera = false;
            }
        }
        return arreglo2;
    }
    
    public static String obtenerCadenaFinal(ArrayList<String> lista) {
        
        String cadenaFinal = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, lista.get(i));
            
        }
        
        return cadenaFinal;
        
    }
    
    
}
