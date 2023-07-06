package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        String klassNames = klasses.stream().map(Klass::getName).map(Object::toString)
                .collect(Collectors.joining(", "));
        String klassInfo = klasses.size() > 0 ? String.format(" I teach Class %s.", klassNames) : "";
        return String.format("My name is %s. I am %d years old. I am a teacher.%s", name, age, klassInfo);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.contains(klass);
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }

    public boolean isTeaching(Student tom) {
        return klasses.contains(tom.getKlass());
    }
}
