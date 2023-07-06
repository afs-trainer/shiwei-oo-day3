package ooss;

public class Person {
    private int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object otherPersonObject) {
        Person other = (Person) otherPersonObject;
        return this.id == other.id;
    }
}
