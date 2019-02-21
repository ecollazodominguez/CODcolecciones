/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class MostrarList {
    
    public static void mostrar(ClassList lista){
            for (int j = 0; j < lista.lista.size(); j++) {
                JOptionPane.showMessageDialog(null,"indice"+"    "+ "elemento\n"+j+"         "+ lista.getElement(j));
                
            }
            
        }
    }
