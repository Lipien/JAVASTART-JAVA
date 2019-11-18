package exercisesandtests.testafter16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java", 2006));
        Map<String, Integer> authors = new HashMap<>();
        for (Book book : books) {
            int occurances = 1;
            if (authors.containsValue(book.getAuthor())) {
                occurances = authors.get(book.getAuthor());
                occurances++;
            }
            authors.put(book.getAuthor(), occurances);
        }
        for (Map.Entry<String, Integer> item : authors.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}

class Book {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}