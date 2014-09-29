package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;

/**
 * @author Leo Gutierrez R. <leogutierrezramirez@gmail.com>
 */
public class TestPersonInstance {
    
    public static void main(String[] args) {
           try {
               Persona.class.getConstructor(String.class).newInstance("asd").foo();
               
               Persona p = new Persona("abc");
               // Persona.class.getMethod("foo", String.class).invoke(p);
               Persona.class.getMethod("foo").invoke( Persona.class.getConstructor(String.class).newInstance("asd") );
               Persona.class.getMethod("foo").invoke(p);
               
               // Animal.class.getMethod("foo").invoke(((Animal)Animal.class.getConstructor(new Class[] {int.class}).newInstance(5)));
               
               for(int i : (int[])Array.newInstance(int.class, 3)) {
                   System.out.println(i);
               }
               
               int length = ((int[])Array.newInstance(int.class, 3)).length;
               
               System.out.println(length);
               
               
           } catch(NoSuchMethodException ex) {
               ex.printStackTrace();
           } catch(InstantiationException ex) {
               ex.printStackTrace();
           } catch(IllegalAccessException ex) {
               ex.printStackTrace();
           } catch(InvocationTargetException ex) {
               ex.printStackTrace();
           }
    }
}

class Test {
    public Test(Integer i) {
        // Test ...
        System.out.println("i: " + i);
    }
    public void foo() {
        System.out.println("hi");
    }
}
class Persona {
    public Persona(String s) {
        // Test ...
        System.out.println("i: " + s);
    }
    public void foo() {
        System.out.println("hi");
    }
}