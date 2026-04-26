Class diagram


public class A {

    private A() {
    }

    private static A a;

    public  static synchronized A getInstance() {
        
        if (a == null) {
            a = new A();
        }

        return a;
    }
}

<img width="607" height="250" alt="image" src="https://github.com/user-attachments/assets/a8e9fb1e-1775-4bd6-9d05-c9c05546f913" />

