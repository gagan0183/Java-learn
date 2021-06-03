public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Main method");
        StaticMethodsDemo.method1();
    }

    static void method1() {
        System.out.println("Inside static method");
    }

    static {
        System.out.println("Static blocks");
    }
}
