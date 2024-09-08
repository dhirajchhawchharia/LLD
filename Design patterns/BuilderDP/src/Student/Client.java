package Student;

public class Client {
    public static void main(String[] args) {
        StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();
        StudentBuilder managementStudentBuilder = new ManagementStudentBuilder();

        Director director1 = new Director(engineeringStudentBuilder);
        Director director2 = new Director(managementStudentBuilder);

        Student engineering = director1.createStudent();
        Student management = director2.createStudent();

        System.out.println(engineering.toString());
        System.out.println(management.toString());
    }
}
