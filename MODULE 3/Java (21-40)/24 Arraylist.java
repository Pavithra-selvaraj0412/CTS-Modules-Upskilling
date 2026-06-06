import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ram");
        students.add("Ravi");
        students.add("Kumar");

        for(String s : students) {
            System.out.println(s);
        }
    }
}