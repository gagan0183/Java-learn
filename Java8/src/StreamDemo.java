import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // stream.forEach(p -> System.out.println(p));

        stream.filter(p -> p <= 5).forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");

        Stream<String> streamOfStrings = list.stream();
        streamOfStrings.map(p -> p.toUpperCase()).forEach(p -> System.out.println(p));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Dave", 23));
        persons.add(new Person("Joe", 19));
        persons.add(new Person("Ryan", 54));
        persons.add(new Person("Iyan", 5));
        persons.add(new Person("Ray", 63));

        persons.stream().filter(person -> person.name != null)
                .filter(person -> person.age > 18)
                .filter(person -> person.age < 60)
                .forEach(System.out::println);

    }
}
