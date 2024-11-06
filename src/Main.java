public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the library");
        Library myLibrary = new Library(10);
        myLibrary.addBook("Dune", "Herbert, F", 412, false);
        myLibrary.addBook("A Wizard of Earthsea", "Le Guin, U", 205, false);
        myLibrary.addBook("The Very Hungry Caterpillar", "Carle, E", 22, true);

        myLibrary.listBooks();

    }
}

