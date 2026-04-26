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

<img width="607" height="250" alt="image" src="https://github.com/user-attachments/assets/9a6f8033-1539-4903-a291-8d2cc0445426" />


