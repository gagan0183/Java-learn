import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamProcessing {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        List<String> topStudents = students.stream()
                .filter(result -> result.roundedPercentage > 91)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Top students are: ");
        topStudents.forEach(System.out::println);
    }

    private static List<Student> getStudents() {
        Exam javaExam = new Exam("Java");
        Exam pythonExam = new Exam("Python");
        List<Student> students = new ArrayList<>();
        students.add(new Student(91, "Mary", javaExam));
        students.add(new Student(91, "Annabelle", pythonExam));
        students.add(new Student(100, "Monty", pythonExam));
        return students;
    }

    static class Student {
        int roundedPercentage;
        String name;
        Exam exam;

        public String getName() {
            return name;
        }

        public Student(int roundedPercentage, String name, Exam exam) {
            this.roundedPercentage = roundedPercentage;
            this.name = name;
            this.exam = exam;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "roundedPercentage=" + roundedPercentage +
                    ", name='" + name + '\'' +
                    ", exam=" + exam +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return roundedPercentage == student.roundedPercentage && Objects.equals(name, student.name) && Objects.equals(exam, student.exam);
        }

        @Override
        public int hashCode() {
            return Objects.hash(roundedPercentage, name, exam);
        }
    }

    static class Exam {
        String name;

        public Exam(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Exam{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Exam exam = (Exam) o;
            return Objects.equals(name, exam.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
