package ooss;

public class Klass {
    private int name;

    public Klass(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherKlass) {
        if (otherKlass == null) {
            return false;
        }
        Klass other = (Klass) otherKlass;
        return this.name == other.name;
    }
}
