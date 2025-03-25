public class Student extends Person {
    private int rollNo;

    public Student(String name, double age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %.1f\nRoll Number: %d", name, age, rollNo);
    }
}
