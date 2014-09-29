package reflex;

/**
 * @author Leo Gutierrez R. <leogutierrezramirez@gmail.com>
 */
public class Reflex {
    
    enum SIZE {
        SMALL,
        MEDIUM,
        BIG
    }
    
    private class A {
    }
    
    private class B {
    }

    public static void main(String[] args) {
        
        Class<Double> cD = Double.TYPE;
        System.out.println(cD.getName());
        
        System.out.println("foo".getClass().getName());
        System.out.println(SIZE.BIG.getClass().getName());
        
        // System.out.println(new byte[] {}.getClass().getName());
        System.out.println(new String[] {"a"}.getClass().getName());
        System.out.println(new String[] {"a"}.getClass().getName());
        
        System.out.println(int.class.getName());
        
        try {
            Class cSize = Class.forName("SIZE");
            System.out.println(cSize.getName());
        } catch(ClassNotFoundException ex) {
            
        }
        
        
    }
    
}
