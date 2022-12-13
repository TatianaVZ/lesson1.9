public class Book {
    private Author author;
    private int pageAmount;
    private String publisherName;


    public Book(Author author, int pageAmount, String publisherName) {
        this.author = author;
        this.pageAmount = pageAmount;
        this.publisherName = publisherName;
    }
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}