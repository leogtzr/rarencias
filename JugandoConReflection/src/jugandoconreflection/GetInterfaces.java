/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jugandoconreflection;

import java.lang.reflect.Constructor;

/**
 *
 * @author Leo Gutiérrez Ramírez | leogutierrezramirez@gmail.com
 */
public class GetInterfaces {
        
   public static void main(String[] args) {
        
        Class clase = null;
        
        try {
            clase = Class.forName("jugandoconreflection.Inter");
            
            Constructor cons = null;
            
            try {
                cons = Inter.class.getConstructor(new Class[] {Integer.class});
            } catch(NoSuchMethodException ex) {
                System.out.println(ex);
            }
            
            for(Class x : clase.getInterfaces()) {
                System.out.println(x.getName());
            }
            
        } catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
}

class Inter {
    public Inter(int i) {
    }
}