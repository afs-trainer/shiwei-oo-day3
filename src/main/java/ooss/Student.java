package ooss;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student.", name, age);
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }
}
