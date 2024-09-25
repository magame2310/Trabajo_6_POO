/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author ASUS
 */
public class Principal {

    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal; /* Define la ventana
        principal */
        miVentanaPrincipal= new VentanaPrincipal(); /* Crea la ventana
        principal */
        miVentanaPrincipal.setVisible(true); /* Establece la ventana
        como visible */
        // Establece que la ventana no puede cambiar su tamaño
        miVentanaPrincipal.setResizable(false);
    }
}
