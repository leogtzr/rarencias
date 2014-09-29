package jugandoconreflection;

import java.lang.reflect.Field;

public class SetFields {
    
    public static void main(String[] args) {
        
        Class aClass = ShitClass2.class;
        Field field = null;
        
        try {
            field = aClass.getField("edad");

            ShitClass2 shit = new ShitClass2();
            shit.edad = 5;
            
            System.out.println("shit: " + shit.edad);
            
            field.set(shit, 2);
            
            System.out.println("shit: " + shit.edad);
            
            System.out.println(field.get(shit));
            
        } catch(NoSuchFieldException ex) {
            System.out.println(ex);
        } catch(IllegalAccessException ex) {
            System.out.println(ex);
        }
        
    }

}

class ShitClass2 {
    public int edad;
}