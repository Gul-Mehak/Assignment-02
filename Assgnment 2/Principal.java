public class Principal extends Person {
    private double experience;

    public Principal(String name, double age, double experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %.1f\nExperience: %.1f years", name, age, experience);
    }
}
