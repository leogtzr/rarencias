package jugandoconreflection;

import java.lang.reflect.Field;

/**
 *
 * @author Leo Gutiérrez Ramírez | leogutierrezramirez@gmail.com
 */
public class GetFields {
    public static void main(String[] args) {
        for(Field f : TestDate.class.getFields()) {
            System.out.println(f.getType().getName());
        }
    }
}

class TestDate {
    public int day;
    public int month;
    public int year;
}