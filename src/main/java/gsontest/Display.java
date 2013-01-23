package gsontest;

public abstract class Display {
    protected String name;

    protected Display() {
        this("default");
    }

    protected Display(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
