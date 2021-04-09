package Model;

import java.util.ArrayList;

public class Lists {
    public int id;
    public String name;
    public java.util.List<Item> itemList = new ArrayList<>();

    public Lists(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
