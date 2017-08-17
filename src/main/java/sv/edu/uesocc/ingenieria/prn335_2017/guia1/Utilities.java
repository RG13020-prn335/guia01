/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Utilities {
    
  public String getResume(String texto){
      String cadena="";
      texto=JOptionPane.showInputDialog("ingrese la introduccion");
  for(int posicion=0;posicion<31;posicion++){
  cadena=cadena+texto.charAt(posicion);
   }
  return(cadena);
  }
    
   
  
  
  
  
  
}
