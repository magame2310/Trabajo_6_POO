/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.principal.Actualizar;
import com.mycompany.principal.Crear;
import com.mycompany.principal.Eliminar;
import com.mycompany.principal.Leer;
import com.mycompany.principal.VentanaCrear;
import com.mycompany.principal.VentanaEliminar;


/**
 *
 * @author ASUS
 */
/**
* @version 1.2/2020
*/
public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton crear, leer, actualizar, eliminar;
    /**
    * Constructor de la clase VentanaPrincipal
    */
    public VentanaPrincipal(){
        inicio();
        setTitle("CRUD"); 
        setSize(500,160);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
    * Método que crea la ventana con sus diferentes componentes
    * gráficos
    */
    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null);
        crear = new JButton();
        crear.setText("Crear");
        crear.setBounds(20, 50, 80, 23); 
        crear.addActionListener(this);
        contenedor.add(crear);
        
        leer = new JButton();
        leer.setText("Leer");
        leer.setBounds(125, 50, 80, 23); 
        leer.addActionListener(this);
        contenedor.add(leer);
        
        actualizar = new JButton();
        actualizar.setText("Actualizar");
        actualizar.setBounds(225, 50, 100, 23);
        actualizar.addActionListener(this);
        contenedor.add(actualizar);
        
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(350, 50, 100, 23); 
        eliminar.addActionListener(this);
        contenedor.add(eliminar);
        
    }
    
    /**
    * Método que gestiona los eventos generados en la ventana principal
    */
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == crear) { 
            VentanaCrear VCrear = new VentanaCrear(); 
            VCrear.setVisible(true); 
        }
        
        if (evento.getSource() == leer) { 
            VentanaLeer VLeer = new VentanaLeer(); 
            VLeer.setVisible(true); 
        }
        
        if (evento.getSource() == actualizar) { 
            VentanaActualizar VActualizar = new VentanaActualizar(); 
            VActualizar.setVisible(true); 
        }
        
        if (evento.getSource() == eliminar) { 
            VentanaEliminar VEliminar = new VentanaEliminar(); 
            VEliminar.setVisible(true); 
        }
        
        
    }
}
