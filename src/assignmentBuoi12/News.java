package assignmentBuoi12;

public class News implements INews {
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println(title);
        System.out.println(publishDate);
        System.out.println(author);
        System.out.println(content);
        System.out.println(averageRate);
    }
}
