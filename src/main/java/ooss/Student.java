package ooss;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {

        String klassInfo;
        if (klass == null) {
            klassInfo = "";
        } else {
            if (klass.getLeader().equals(this)) {
                klassInfo = String.format(" I am the leader of class %d.", klass.getName());
            } else {
                klassInfo = String.format(" I am in class %d.", klass.getName());
            }
        }
        return String.format("My name is %s. I am %d years old. I am a student.%s", name, age, klassInfo);
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
}
