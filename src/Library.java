import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;    // ArrayList<Integer> myArray = new ArrayList<>();
    private int currentSize;


    public Library(int maxSize) {
        collection = new ArrayList<>();;
        currentSize = 0;
    }


    public void listBooks() {
        for (int i=0; i<currentSize; i++) {
            Book currentBook = collection.get(i);
            System.out.print(currentBook.title + ", ");
            System.out.print(currentBook.author + ", ");
            System.out.print(currentBook.pageCount + ", ");
            System.out.println(currentBook.hardback);
        }
    }

    public void addBook(String title, String author,int pageCount, boolean hardback) {
        Book book = new Book(title, author, pageCount, hardback);
        if (currentSize < 10) {
            currentSize++;
            collection.add(book);
        }
    }
}
