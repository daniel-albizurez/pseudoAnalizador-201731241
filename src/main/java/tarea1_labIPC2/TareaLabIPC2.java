/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_labIPC2;

import controlador.ControladorAnalizador;
import java.util.Scanner;
import modelo.Analizador;
import vista.JFrmAnalizador;

/**
 *
 * @author DANIEL
 */
public class TareaLabIPC2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        JFrmAnalizador vista = new JFrmAnalizador();
        ControladorAnalizador controlador = new ControladorAnalizador(vista);
        
        
    }
    
}
