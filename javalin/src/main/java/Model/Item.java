package Model;

public class Item {
    public int id;
    public int belongsTo;
    public String name;
    public String type;

    public Item(int id, int belongsTo, String name, String type) {
        this.id = id;
        this.belongsTo = belongsTo;
        this.name = name;
        this.type = type;
    }
}
