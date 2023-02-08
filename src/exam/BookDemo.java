package exam;

public class BookDemo {
    public static void main(String[] args){
        Author tg = new Author("Russel", "Winderand");
        Book bk = new Book("Developing Java Software",tg,79.75);
        System.out.println(bk.toString());
    }
}
