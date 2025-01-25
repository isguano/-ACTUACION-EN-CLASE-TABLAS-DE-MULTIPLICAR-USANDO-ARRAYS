
package com.mycompany.arrayejemplos;

public class ArrayEjemplos {

    public static void main(String[] args) {
 
        int tabla [] = {5,6,5,48,9,403};
        for (int numerotabla : tabla) {
            for (int i = 0; i < 11; i++) {
                System.out.println(numerotabla+"x"+i+"="+(numerotabla*i));   
            }    
        } 
    }
}
