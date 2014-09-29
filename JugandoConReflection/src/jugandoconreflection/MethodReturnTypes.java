package jugandoconreflection;

import java.lang.reflect.Method;

public class MethodReturnTypes {
    public static void main(String[] args) {
        for(Method m : ShitClass.class.getMethods()) {
            System.out.println("Método: " + m.getName());
            System.out.println("Return type: " + m.getReturnType().getName());
        }
    }
}
class ShitClass {
    public void foo() {
    }
}