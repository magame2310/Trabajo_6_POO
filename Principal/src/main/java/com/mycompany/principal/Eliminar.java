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
public class Eliminar {
    private String name;
    
    public Eliminar(String name){
        this.name = name;
    }
    
    public String eliminar(){
        try {
            String readName;
            int index;
 
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {

                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                readName = raf.readLine();

                if (readName.equals(this.name)) {
                    found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer()< raf.length()) {

                    readName = raf.readLine();

                    if (readName.equals(this.name)) {
                        continue;
                    }

                    tmpraf.writeBytes(readName);

                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();
 
                return "Nombre eliminado";
            }

            else {

                raf.close();
 
                return "El nombre no fue encontrado";
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
