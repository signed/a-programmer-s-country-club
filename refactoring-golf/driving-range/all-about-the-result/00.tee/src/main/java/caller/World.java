package caller;

import library.Index;
import library.Library;
import library.ReservedMediaShelf;
import library.Storage;

public class World {
    public static void main(String[] args) {
        Library library = new Library(new Index(), new Storage(), new ReservedMediaShelf("first floor"));
        Librarian librarian = new Librarian(library);
        Reader reader = new Reader(librarian);
        reader.reserveBook();
    }
}
