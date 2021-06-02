import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isEmpty());
    }
}