package ooss;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student.", name, age);
    }

    @Override
    public boolean equals(Object otherStudent) {
        Student other = (Student) otherStudent;
        return this.id == other.id;
    }
}
