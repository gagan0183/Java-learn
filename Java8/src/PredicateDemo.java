import java.util.function.Predicate;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        Person person = new Person("Alex", 15);
        Predicate<Person> predicate = p -> p.age > 18;
        boolean isEligible = predicate.test(person);
        System.out.println("isEligible " + isEligible);
    }

}
