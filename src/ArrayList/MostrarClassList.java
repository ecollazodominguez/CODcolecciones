/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import javax.swing.JOptionPane;

/**
 * Clase en la que mostramos el ArrayList
 * @author ecollazodominguez
 */
public class MostrarClassList {

    public static void mostrar(ClassList lista) {
        int j = 0;
        String test1 = "index" + "   " + "value\n";
        String test2 = "";
        for (j = 0; j < lista.lista.size(); j++) {
            test2 = test2 + j + "           " + lista.getElement(j) + "\n";

        }
        JOptionPane.showMessageDialog(null, test1 + test2);
    }
}
