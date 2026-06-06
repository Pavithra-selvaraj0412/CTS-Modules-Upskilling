import java.lang.reflect.*;

class Demo {
    public void show() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Demo");

        Object obj = c.getDeclaredConstructor().newInstance();

        for(Method m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
            m.invoke(obj);
        }
    }
}