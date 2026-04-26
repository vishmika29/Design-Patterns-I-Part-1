package model;

public class A {
    private A(){ }
    
    private static A a;
    
    public static synchronized A getA(){
        if (a == null) {
            a = new A();
        }
        
        return a;
    }
}
