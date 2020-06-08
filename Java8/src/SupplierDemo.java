import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Alex", 19);
        Predicate<Person> predicate = p -> p.age > 18;
        boolean isEligible = predicate.test(supplier.get());
        System.out.print("isEligible " + isEligible);
    }
}
