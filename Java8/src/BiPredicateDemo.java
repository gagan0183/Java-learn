import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        Person person = new Person("Alex", 19);
        BiPredicate<Person, Integer> biPredicate = (p, minAge) -> p.age > minAge;
        boolean isEligible = biPredicate.test(person, 18);
        System.out.print("Predicate example " + isEligible);
    }
}
