public class LambdaDemo {
    public static void main(String[] args) {
        StringRunnable fn = (name) -> {
//            String name = "Gagan";
            System.out.println("Hi " + name);
        };
        fn.run("Gagan");
    }

    @FunctionalInterface
    public interface StringRunnable {
        public abstract void run(String name);
    }
}
