import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Person person = new Person("Alex", 15);
        Predicate<Person> predicate = p -> p.age > 18;
        boolean isEligible = predicate.test(person);
        System.out.println("isEligible " + isEligible);
    }

}
