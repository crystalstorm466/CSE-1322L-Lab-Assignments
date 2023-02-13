package Lab05;

public class Book extends Item {
    private int isbn_number;
    private String author;

    public String getAuthor() { return author; }
    public int getIsbn_number() { return isbn_number; }
    public void setAuthor(String author) { this.author = author; }
    public void setIsbn_number(int isbn_number) { this.isbn_number = isbn_number; }

    public Book() {
        this.isbn_number = 0;
        this.author = "";
    }

    public Book(int isbn, String author, String title) {
        this.isbn_number = isbn;
        this.author = author;
        super.setTitle(title);
    }

    @Override
    public String getListing() {
        String list = ("Book Name - " + getTitle() + "\n" +
                "Author - " + getAuthor() + "\n" +
                "ISBN# - " + getIsbn_number());
        return list;
    }

}
