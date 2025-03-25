public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sir Shahid", 40.0, "G01", 12);
        Teacher t2 = new Teacher("Sir Shahrukh", 40.0, "G02", 15);

        Student s1 = new Student("Gul", 19, 1);
        Student s2 = new Student("Rameen", 19, 2);

        Principal p1 = new Principal("Ali", 43, 10);

        ClassRoom classA = new ClassRoom("A", 2, t1);
        classA.addStudent(s1);
        classA.addStudent(s2);

        School mySchool = new School("Allied School", "Lahore", p1);

        System.out.println(classA);
        System.out.println(mySchool);
    }
}
