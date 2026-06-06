import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(101, "Ram");
        map.put(102, "Ravi");

        int id = 101;

        System.out.println(map.get(id));
    }
}