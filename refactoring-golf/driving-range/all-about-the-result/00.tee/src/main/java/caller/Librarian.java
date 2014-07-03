package caller;

import library.Library;
import library.ReservationResult;

public class Librarian {
    private final Library library;

    public Librarian(Library library) {
        this.library = library;
    }

    public void pleaseReserve(String title, Reader reader) {
        ReservationResult result = library.reserve("War and Peace");
        if(result.wasSuccessful()){
            reader.informAboutSuccessfulReservation(result.successMessage);
        }else{
            reader.informAboutFailedReservation(result.failedMessage);
        }
    }
}
