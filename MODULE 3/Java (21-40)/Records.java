import java.util.*;
import java.util.stream.*;

record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("Ram",20),
                new Person("Ravi",15),
                new Person("Kumar",25)
        );

        list.stream()
            .filter(p -> p.age() >= 18)
            .forEach(System.out::println);
    }
}