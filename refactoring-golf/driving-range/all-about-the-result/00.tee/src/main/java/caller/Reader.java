package caller;

public class Reader {

    private final Librarian librarian;

    public Reader(Librarian librarian) {
        this.librarian = librarian;
    }

    public void reserveBook() {
        librarian.pleaseReserve("war and Peace", this);
    }

    public void informAboutSuccessfulReservation(String successMessage) {
        System.out.println(successMessage);
    }

    public void informAboutFailedReservation(String failedMessage) {
        System.out.println(failedMessage);
    }
}
