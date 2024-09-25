/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ASUS
 */
public class Leer {
    private String resultado;
    
    public String leer(){
    try {
            String fileName;
 
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }
 
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
            
            resultado = "";

            while (raf.getFilePointer() < raf.length()) {
                fileName = raf.readLine();

                resultado = resultado + fileName + ", ";
            }
            
            return resultado;
        }
 
        catch (IOException ioe) {
 
            return "Ocurrió un error";
        }
        catch (NumberFormatException nef) {
 
            return "Ocurrió un error";
        }
    }
    }
