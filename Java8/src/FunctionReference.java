import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionReference {
    public static void main(String[] args) {
        Consumer<String> bound = System.out::println;
        bound.accept("Hello from bound method reference");

        BiConsumer<PrintStream, String> unbound = PrintStream::println;
        unbound.accept(System.out,"Hello from unbound method reference");
    }
}
