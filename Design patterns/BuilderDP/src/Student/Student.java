package Student;


import java.util.List;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String fathersName;
    private String mothersName;
    private List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.subjects = builder.subjects;
        this.name = builder.name;
    }

    public String toString() {
        return ""+ " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fathersName +
                " mother name: " + this.mothersName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);

    }
}
