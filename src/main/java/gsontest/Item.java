package gsontest;

public class Item {
    private String id;
    private String type;
    private Display display;

    public Item() {
    }

    public Item(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", display=" + display +
                '}';
    }
}
