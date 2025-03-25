public class School {
    private String name;
    private String address;
    private Principal principal;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPrincipal:\n%s", name, address, principal.toString());
    }
}
