import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {
    Map<Integer, Employee> employees = new HashMap<>();
    public Optional<Employee> getEmployee(Integer employeeId) {
        return Optional.ofNullable(employees.get(employeeId));
    }
    public static void main(String[] args) {
        OptionalDemo optionalDemo = new OptionalDemo();
        Optional<Employee> employee = optionalDemo.getEmployee(90);
        if (employee.isPresent()) {
            System.out.println("Employee name is " + employee.get().getName());
        } else {
            System.out.println("No employee present");
        }
    }
}
