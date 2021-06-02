import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Consumer<String> fn = System.out::println;
        fn.accept("Value");

        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());

        Function<Integer, String> function = (value) -> "this";
        System.out.println(function.apply(1));

        Predicate<Integer> isRetired = (age) -> age > 65;
        System.out.println(isRetired.test(100));
    }
}
