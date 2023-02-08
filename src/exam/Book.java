package exam;

public class Book {
    public String Title;
    public Author Author_name;
    public double price;

    public Book(String title, Author author_name, double price) {
        Title = title;
        Author_name = author_name;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Author getAuthor_name() {
        return Author_name;
    }

    public void setAuthor_name(Author author_name) {
        Author_name = author_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return Title +" - "+ Author_name +" - "+ price;
    }
}
