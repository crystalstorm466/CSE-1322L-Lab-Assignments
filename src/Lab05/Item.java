package Lab05;

public class Item {
    private String title;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
    public Item() {
        this.title = "";
    }

    public Item(String title) {
        this.title = title;
    }

    public String getListing() {
        return " ";
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                '}';
    }


}
