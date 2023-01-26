package Labs.Lab11;

public class Book {
    private String title,author;

    public Book(){
        title = "Test";
        author = null;
    }
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void setTitle (String title){
        this.title = title;
    }
    public void setAuthor (String author){
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public String toString(){
        String description = ("\""+title+"\" by "+author);
        return description;
    }
}
