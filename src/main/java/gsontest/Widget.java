package gsontest;

import java.util.List;

public class Widget {
    private String name;
    private List<Item> items;

    public Widget(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
