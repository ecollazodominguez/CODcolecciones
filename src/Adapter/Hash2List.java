/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import ArrayList.ClassList;
import hashmap.ClassHash;


/**
 * Clase adapter, queremos convertir un Hash en un Array
 * @author ecollazodominguez
 */

//heredamos la clase que queremos usar
public class Hash2List extends ClassList {
    
    //Creamos constructor con el objeto a convertir y usamos los metodos que nos dan las clases ArrayList y HashMap
    public Hash2List(ClassHash hashAconvertir) {     
        lista.addAll(hashAconvertir.contenedor.values()); //Con values
            
        }
            
        }

