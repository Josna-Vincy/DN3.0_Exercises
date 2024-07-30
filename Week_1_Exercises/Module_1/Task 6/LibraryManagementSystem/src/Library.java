import java.util.Arrays;

class Library {
    private final Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(int bookId, String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(bookId, title, author);
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count, (b1, b2) -> b1.title.compareToIgnoreCase(b2.title));
        int left = 0;
        int right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = books[mid].title.compareToIgnoreCase(title);
            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
