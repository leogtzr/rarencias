package jugandoconreflection;

import java.lang.reflect.Array;

/**
 * @author Leo Gutiérrez Ramírez | leogutierrezramirez@gmail.com
 */
public class CreateArrays {
    public static void main(String[] args) {
        int[] x = (int[])Array.newInstance(int.class, 3);
    }
}

