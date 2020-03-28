package world;

class Something {

}

public class Plant {
    // Accepatable practice --- it's final.
    public final static int ID = 8;
    // Bad practice
    public String name;
    protected String size;
    int height;
    private String type;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}