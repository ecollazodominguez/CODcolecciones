/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Adapter.Hash2List;
import ArrayList.MostrarClassList;
import hashmap.ClassHash;

/**
 *
 * @author ecollazodominguez
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassHash miHash = new ClassHash();
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
        
        Hash2List miHash2List = new Hash2List(miHash);
        MostrarClassList.mostrar(miHash2List);
    }
    
   
}
