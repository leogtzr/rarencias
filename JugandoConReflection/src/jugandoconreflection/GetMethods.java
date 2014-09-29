/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jugandoconreflection;

import java.lang.reflect.Method;

/**
 *
 * @author Leo Gutiérrez Ramírez | leogutierrezramirez@gmail.com
 */
public class GetMethods {
    public static void main(String[] args) {
        for(Method m : MultipleMethods.class.getMethods()) {
            System.out.println("Método: " + m.getName() + " .... ");
            for(Class type : m.getParameterTypes()) {
                System.out.println(type.getName());
            }
        }
    }
}

class MultipleMethods {
    public void foo() {
        
    }
    public void foo(int x) {
        
    }
    public void foo(int x, int y) {
        
    }
}