public final class Employee {

    private final int ID;
    private final String family;
    private final String name;

    private Employee(int ID, String family, String name) {
        this.ID = ID;
        this.family = family;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
}
