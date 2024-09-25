/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.principal.Leer;

/**
 *
 * @author ASUS
 */
public class VentanaLeer extends JFrame implements ActionListener{
    // Un contenedor de elementos gráficos
    private Container contenedor;
    private JLabel resultado;
    private JButton leer;
     
    public VentanaLeer(){
        inicio();
        setTitle("Leer"); // Establece el título de la ventana
        setSize(500,200); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        setResizable(false); /* Establece que el botón de cerrar permitirá
        salir de la aplicación */
    }
    
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null); 
        resultado = new JLabel();
        resultado.setText("Resultado: ");
        resultado.setBounds(20, 110, 135, 23);
        
        leer = new JButton();
        leer.setText("Leer");
        leer.setBounds(200, 50, 80, 23); /* Establece la posición */
        leer.addActionListener(this);
        
        contenedor.add(resultado);
        contenedor.add(leer);
    }
    
    public void actionPerformed(ActionEvent event) {
        boolean error = false; /* Se inicializa variable para determinar si
        ocurre un error */

        try {
        Leer leer = new Leer(); 
        resultado.setText("Resultado: " + leer.leer());
            } catch (Exception e){
            error = true; // Si ocurre una excepción
            } finally {
                if(error) { /* Si ocurre una excepción, se muestra un mensaje de error */
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }
}
