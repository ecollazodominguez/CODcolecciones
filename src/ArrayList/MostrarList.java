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
        int j = 0;
        String test1= "indice"+"   "+ "elemento\n";
        String test2= "";
            for (j = 0; j < lista.lista.size(); j++) {
                test2 =test2+j+"           "+ lista.getElement(j)+"\n";
//JOptionPane.showMessageDialog(null,"indice"+"    "+ "elemento\n"+j+"         "+ lista.getElement(j));
//JOptionPane.showMessageDialog(null, test1 + test2);
                
            }
//JOptionPane.showMessageDialog(null,"indice"+"    "+ "elemento\n"+j+"         "+ lista.getElement(j));
JOptionPane.showMessageDialog(null, test1 + test2);
        }
    }
