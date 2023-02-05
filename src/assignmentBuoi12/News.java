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
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }
    public int[] RateList = new int[3];
    public float AverageRate;
    public void Calculate() {
        int S = 0;
        for (int i = 0; i<RateList.length; i++){
            S += RateList[i];
        }
        System.out.println(S);
        AverageRate = (float) S/RateList.length;
    }
}
