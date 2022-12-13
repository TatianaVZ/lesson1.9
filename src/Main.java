public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stivin", "King" );
        Author author2 = new Author("Lev", "Tolstoy" );
        Book book1 = new Book(author1, 100, "Book Publishing Ltd.");
        Book book2 = new Book(author2,350, "No publisher");
        System.out.println(book1);
        System.out.println(book2);

    }
}