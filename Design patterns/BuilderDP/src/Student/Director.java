package Student;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder)
            return createEngineeringStudent();
        
        if(studentBuilder instanceof ManagementStudentBuilder)
            return createManagementStudent();
        
        return null;
    }

    private Student createEngineeringStudent() {
        return new EngineeringStudentBuilder().setAge(10).setRollNumber(1000).setName("Dhiraj").setSubjects().build();
    }

    private Student createManagementStudent() {
        return new ManagementStudentBuilder().setAge(50).setRollNumber(10001).setName("Don").setMothersName("Sushma").setSubjects().build();
    }
}
