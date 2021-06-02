public class LambdaDemo {
    public static void main(String[] args) {
        Runnable fn = () -> {
            String name = "Gagan";
            System.out.println("Hi " + name);
        };
        fn.run();
    }
}
