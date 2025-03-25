public class Teacher extends Person {
    private String subject;
    private int teacherID;

    public Teacher(String name, double age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %.1f\nSubject: %s", name, age, subject);
    }
}
