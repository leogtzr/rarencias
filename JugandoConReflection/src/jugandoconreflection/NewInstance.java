package jugandoconreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Leo Gutiérrez Ramírez | leogutierrezramirez@gmail.com
 */
public class NewInstance {
    public static void main(String[] args) {
        try {
            Constructor con = Test.class.getConstructor(new Class[] {Integer.class});
            Test test = (Test)con.newInstance(123);
            test.foo();
            
            ((Test)Test.class.getConstructor(new Class[] {Integer.class}).newInstance(56)).foo();
            
        } catch( NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            System.out.println(ex);
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