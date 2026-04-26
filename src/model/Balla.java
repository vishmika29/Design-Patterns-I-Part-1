package model;

public class Balla {
    private Balla(){ }
    
    private static Balla b;
    
    public static synchronized Balla getBalla(){
        if (b == null) {
            b = new Balla();
        }
        
        return b;
    }
}
