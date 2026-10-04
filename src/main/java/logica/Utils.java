/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author glrd4
 */
public class Utils {
    public static String leerString(){
        Scanner teclado = new Scanner(System.in);
        String leer = teclado.nextLine();
        return leer;
    }
    
    public static int leerInt(){
        Scanner teclado = new Scanner(System.in);
        int leer = teclado.nextInt();
        return leer;
    }
}
