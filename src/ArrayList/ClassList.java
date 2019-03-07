/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 * Creamos clase en la que usaremos ArrayList
 * @author ecollazodominguez
 */
public class ClassList implements InterfaceList {
    public ArrayList<String> lista = new ArrayList<>();

    @Override
    public void putElement(String value) {
        lista.add(value);
    }

    @Override
    public String getElement(int value) {
       return lista.get(value);
    }
}
