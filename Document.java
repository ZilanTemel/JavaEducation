import java.util.Date;

public class Document {
    private String[] authors;
    private int authorCount;
    private Date date;


    public Document() {
        this.authors = new String[10];
        this.authorCount = 0;
        this.date = new Date();
    }

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name) {
        if (authorCount < authors.length) {
            authors[authorCount] = name;
            authorCount++;
        } else {
            System.out.println("Author list is full!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
