package jugandoconreflection;

import java.lang.reflect.Constructor;

public class JugandoConReflection {
    
    public static void viewUp(Class x) {
        if(x == null) {
            return;
        } else {
            System.out.println(x.getName());
            viewUp(x.getSuperclass());
        }
    }
    
    public static void main(String[] args) {
        
        Class clase = null;
        
        try {
            clase = Class.forName("jugandoconreflection.D");
            
            for(Class x : clase.getInterfaces()) {
                System.out.println(x.getName());
            }
            
        } catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        /*System.out.println("View ... ");
        viewUp(D.class);*/
        
    }
}

class A {}
class B extends A {}
class C extends B {}
class D extends C implements java.io.Serializable {}