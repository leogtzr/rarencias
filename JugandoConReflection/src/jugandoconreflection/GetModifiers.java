package jugandoconreflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetModifiers {
    public static void main(String[] args) {
        for(Method m : TestModif.class.getMethods()) {
            System.out.println("Método: " + m.getName());
            int mod = m.getModifiers();
            System.out.println(Modifier.isAbstract(mod));
            System.out.println(Modifier.isFinal(mod));
            System.out.println(Modifier.isPublic(mod));
        }
    }
}

class TestModif {
    public static final void foo() {
    }
}