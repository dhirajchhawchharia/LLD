package Student;

import java.util.*;

public class ManagementStudentBuilder extends StudentBuilder {

    @Override
    StudentBuilder setSubjects() {
        List<String> sub = new ArrayList<>();
        sub.add("Networking");
        sub.add("Operations");
        sub.add("HR");
        this.subjects = sub;
        return this;
    }

}
