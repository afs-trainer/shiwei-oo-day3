package ooss;

public class Student extends Person {

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student.", name, age);
    }

    public boolean isIn(Klass klass) {
        return false;
    }
}
