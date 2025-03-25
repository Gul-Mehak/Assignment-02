public class Person {
    String name;
    double age;

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %.1f", name, age);
    }
}
