package ooss;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher.", name, age);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.contains(klass);
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }
}
