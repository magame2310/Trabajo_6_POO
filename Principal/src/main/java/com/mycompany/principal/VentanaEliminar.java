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
import com.mycompany.principal.Eliminar;

/**
 *
 * @author ASUS
 */
public class VentanaEliminar extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel nombre, resultado;
     private JTextField campoNombre;
     private JButton eliminar;
     
     public VentanaEliminar(){
        inicio();
        setTitle("Eliminar"); // Establece el título de la ventana
        setSize(350,210); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        setResizable(false); /* Establece que el botón de cerrar permitirá
        salir de la aplicación */
     }
     
     private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de
        contenidos de la ventana */
        contenedor.setLayout(null); 
        nombre = new JLabel();
        nombre.setText("Nombre a eliminar:");
        nombre.setBounds(20, 20, 135, 23); 
        campoNombre = new JTextField();
        campoNombre.setBounds(150, 20, 135, 23);
        
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(100, 80, 135, 23); 
        eliminar.addActionListener(this);
        
        resultado = new JLabel();
        resultado.setText("Resultado: ");
        resultado.setBounds(20, 110, 250, 23);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(eliminar);
        contenedor.add(resultado);
        }
     
     public void actionPerformed(ActionEvent event) {
        boolean error = false; 
        String nombre;

        try {
        nombre = campoNombre.getText();
       
        Eliminar eliminar = new Eliminar(nombre); 
        resultado.setText("Resultado: " + eliminar.eliminar());
            } catch (Exception e){
            error = true; // Si ocurre una excepción
            } finally {
                if(error) { /* Si ocurre una excepción, se muestra un mensaje de error */
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
}
