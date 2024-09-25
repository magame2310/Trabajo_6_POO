/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
/**
 *
 * @author ASUS
 */
public class Crear {
    private String name;
    
    public Crear(String name) {
        this.name = name;
    }
    
    public String crear() {
        try {
            String fileName;
 
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }
 
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            while (raf.getFilePointer() < raf.length()) {
                fileName = raf.readLine();
 
                if (fileName == this.name) {
                    found = true;
                    break;
                }
            }
 
            if (found == false) {
                raf.writeBytes(this.name);

                raf.writeBytes(System.lineSeparator());

                raf.close();

                return "Nombre añadido ";
 
                
            }

            else {
 
                raf.close();
                
                return "Input name does not exists. ";
            }
        }
 
        catch (IOException ioe) {
 
            return "Ocurrió un error";
        }
        catch (NumberFormatException nef) {
 
            return "Ocurrió un error";
        }
    }
    }
