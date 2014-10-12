package javaexceptions;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Leo Gutierrez R. <leogutierrezramirez@gmail.com>
 */
public class JavaExceptions {

    public static void main(String[] args) {
    }
    
}
class A {
    public void foo() throws SQLException {
        
    }
}
class B extends A {
    // In this case we are throwing one more broader exception.
    // We cannot do that!
    @Override
    public void foo() throws SQLException /*, IOException */ , NullPointerException, RuntimeException {
    }
}
class C extends Exception {
    public C(String msj) {
        super(msj);
    }
    public C(Throwable cause) {
        super(cause);
    }
    public C(String msj, Throwable cause) {
        super(msj, cause);
    }
}
class Animal {
    
}
class Dog extends Animal {
    
}
class Cat extends Animal {
    
}
class C1 {
    public Animal getA() {
        return new Animal();
    }
}
class C2 extends C1 {
    @Override
    public Cat getA() {
        return new Cat();
    }
}