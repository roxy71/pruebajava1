/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 ** * /************************************************************************************************************************
 * *  Roxana Rojo Bustamante
 * @author LAB03
 * Fecha:Octubre  30 de 2017
 * Programa: datosUsuario
 * Responsabilidad: Clase 
 
 * @author LAB03
 */
public class datosUsuario
        
{
    
         public static void main(String[] args)
      {
          
         String Nombre;
         int Edad;
         
         Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
         Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
         
            JOptionPane.showMessageDialog(null,"Bienvenido "+(Nombre));
            JOptionPane.showMessageDialog(null,"En 20 años usted tendra "+(Edad+20));
            
         
    }
}
