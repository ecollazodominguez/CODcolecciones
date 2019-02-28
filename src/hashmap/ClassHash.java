/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;

/**
 *
 * @author ecollazodominguez
 */
public class ClassHash implements InterfaceHash {
     public HashMap<Integer,String> contenedor = new HashMap<>();

    @Override
    public void putValue(int key, String value) {
            contenedor.put(key,value);
    }

    @Override
    public String getValue(int key) {
         return contenedor.get(key);
    }
}
