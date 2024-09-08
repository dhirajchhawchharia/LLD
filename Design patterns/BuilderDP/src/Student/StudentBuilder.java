package Student;

import java.util.List;

abstract class StudentBuilder {
    public int rollNumber;
    public String name;
    public int age;
    public String fathersName;
    public String mothersName;
    public List<String> subjects;

    public StudentBuilder setRollNumber(int n) {
        this.rollNumber = n;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFathersName(String name) {
        this.fathersName = name;
        return this;
    }

    public StudentBuilder setMothersName(String name) {
        this.mothersName = name;
        return this;
    }

    abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}
