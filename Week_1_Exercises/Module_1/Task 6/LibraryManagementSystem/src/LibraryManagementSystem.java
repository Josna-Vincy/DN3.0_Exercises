public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(1, "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(2, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(3, "1984", "George Orwell");
        library.addBook(4, "Pride and Prejudice", "Jane Austen");

        System.out.println("All Books in the Library:");
        library.displayBooks();

        System.out.println("\nSearching for '1984' using Linear Search:");
        Book book1 = library.linearSearchByTitle("1984");
        System.out.println(book1 != null ? book1 : "Book not found");

        System.out.println("\nSearching for 'To Kill a Mockingbird' using Binary Search:");
        Book book2 = library.binarySearchByTitle("To Kill a Mockingbird");
        System.out.println(book2 != null ? book2 : "Book not found");
    }
}
