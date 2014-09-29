package reflex;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Leo Gutierrez R. <leogutierrezramirez@gmail.com>
 */
public class TestFactorial {
    public static void main(String[] args) {
        //Factorial.class.getConstructor(int.class)
        try {
            Constructor<Factorial> cons = Factorial.class.getConstructor(int.class);
            Factorial factorial = cons.newInstance(6);
            Field arg = factorial.getClass().getField("n");
            arg.set(factorial, 5);
            System.out.println(factorial.getClass().getMethod("calculate").invoke(factorial));
            
        } catch(NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch(InstantiationException ex) {
            ex.printStackTrace();
        } catch(IllegalAccessException ex) {
            ex.printStackTrace();
        } catch(InvocationTargetException ex) {
            ex.printStackTrace();
        } catch(NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
}
class Factorial {
    
    public int n;
    
    public Factorial(int n) {
        this.n = n;
    }
    
    public int getN() {
        return this.n;
    }
    
    public long calculate() {
        long f = 1;
        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}