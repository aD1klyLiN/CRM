public final class Employee {

    private final int ID;
    private final String family;
    private final String post;

    private Employee(int ID, String family, String post) {
        this.ID = ID;
        this.family = family;
        this.post = post;
    }

    public int getID() {
        return ID;
    }

    public String getFamily() {
        return family;
    }

    public String getPost() {
        return post;
    }
}
