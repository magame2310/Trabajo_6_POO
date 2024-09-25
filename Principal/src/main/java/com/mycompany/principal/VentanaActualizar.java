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
import com.mycompany.principal.Actualizar;

/**
 *
 * @author ASUS
 */
public class VentanaActualizar extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel nombreActual, nuevoNombre, resultado;
    private JTextField campoNombreActual, campoNombreNuevo;
    private JButton actualizar;
    
    public VentanaActualizar() {
        inicio();
        setTitle("Actualizar"); // Establece el título de la ventana
        setSize(350,210); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        setResizable(false); /* Establece que el botón de cerrar permitirá
        salir de la aplicación */
    }
    
    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        nombreActual = new JLabel();
        nombreActual.setText("Nombre actual:");
        nombreActual.setBounds(20, 20, 135, 23); 
        campoNombreActual = new JTextField();
       
        campoNombreActual.setBounds(150, 20, 135, 23);
        
        nuevoNombre = new JLabel();
        nuevoNombre.setText("Nombre nuevo:");
        nuevoNombre.setBounds(20, 50, 135, 23); 
        campoNombreNuevo = new JTextField();
        campoNombreNuevo.setBounds(150, 50, 135, 23);
        
        actualizar = new JButton();
        actualizar.setText("Actualizar");
        actualizar.setBounds(100, 80, 135, 23); 
        actualizar.addActionListener(this);
        
        resultado = new JLabel();
        resultado.setText("Resultado: ");
        resultado.setBounds(20, 110, 250, 23);
        
            contenedor.add(nombreActual);
            contenedor.add(campoNombreActual);
            contenedor.add(nuevoNombre);
            contenedor.add(campoNombreNuevo);
            contenedor.add(actualizar);
            contenedor.add(resultado);
        }
    
    public void actionPerformed(ActionEvent event) {
        boolean error = false; 
        String nombreActual, nuevoNombre;

        try {
        nombreActual = campoNombreActual.getText();
        nuevoNombre = campoNombreNuevo.getText();
        
        Actualizar actualizar = new Actualizar(nombreActual, nuevoNombre); 

        resultado.setText("Resultado: " + actualizar.actualizar());

            } catch (Exception e){
            error = true; 
            } finally {
                if(error) { 
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
}
