/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import ArrayList.ClassList;
import ArrayList.MostrarList;

/**
 *
 * @author ecollazodominguez
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassHash hash = new ClassHash();
        
        hash.putValue(1, "Hola");
        hash.putValue(2, "Adios");
        System.out.println(hash.getValue(1));
        System.out.println(hash.getValue(2));
        
        ClassList arr = new ClassList();
        
        arr.putElement("patata");
        arr.putElement("fresa");
        arr.putElement("manzana");
        arr.putElement("melocoton");
        MostrarList.mostrar(arr);
    }
    
}
