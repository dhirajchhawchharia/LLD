package Student;

import java.util.*;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    StudentBuilder setSubjects() {
        List<String> sub = new ArrayList<>();
        sub.add("OS");
        sub.add("DBMS");
        sub.add("DSA");
        this.subjects = sub;
        return this;
    }

}
