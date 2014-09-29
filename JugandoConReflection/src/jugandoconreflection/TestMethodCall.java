package jugandoconreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMethodCall {
    public static void main(String[] args) {
        Class cl = Animal.class;
        Animal an = null;
        try {
            
            Animal.class.getMethod("foo").invoke(((Animal)Animal.class.getConstructor(new Class[] {int.class}).newInstance(5)));
            
            /*Constructor con = Animal.class.getConstructor(new Class[] {Integer.class});
            an = (Animal)con.newInstance(123);
            an.hacerRuido();*/
            
            // Animal.class.getMethod("hacerRuido").invoke(con, args)
            
            /*System.out.println("Invocando métodos ... ");
            for(Method m : Animal.class.getMethods()) {
                //System.out.println("Intentando invocar ... " + m.getName());
                //m.invoke(an);
                switch(m.getName()) {
                    case "hacerRuido":
                        m.invoke(an);
                        break;
                }
            }*/
            
            // ((Test)Test.class.getConstructor(new Class[] {Integer.class}).newInstance(56)).foo();
            
        } catch( NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            System.out.println(ex);
        }
        
    }
}

class Animal {
    public Animal(int x) {}
    public void foo() {
        System.out.println("Muuuu");
    }
}