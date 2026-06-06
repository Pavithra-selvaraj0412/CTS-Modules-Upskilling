import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango","Apple","Banana");

        Collections.sort(list, (a,b) -> a.compareTo(b));

        System.out.println(list);
    }
}