public class ClassRoom {
    private String className;
    private int classCode;
    private Teacher teacher;
    private Student students[] = new Student[5];
    private int count = 0;

    public ClassRoom(String className, int classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassRoom: ").append(className).append("\n");
        sb.append("Teacher: ").append(teacher.getName()).append("\n");
        sb.append("Students: ").append(count).append("\n");
        for (int i = 0; i < count; i++) {
            sb.append(students[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
