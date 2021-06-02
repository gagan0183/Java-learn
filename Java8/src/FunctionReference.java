import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionReference {
    public static void main(String[] args) {
        //bound instance method reference
        Consumer<String> bound = System.out::println;
        bound.accept("Hello from bound method reference");

        //unbound instance method reference
        BiConsumer<PrintStream, String> unbound = PrintStream::println;
        unbound.accept(System.out,"Hello from unbound method reference");

        //static method reference
        Supplier<Thread> staticMethodReference = Thread::currentThread;
        System.out.println("Static method reference " + staticMethodReference.get());

        //constructor method reference
        Supplier<Calendar> construc = GregorianCalendar::new;
        Calendar c = construc.get();
        System.out.println("Calendar method reference " + c.toString());
    }
}
