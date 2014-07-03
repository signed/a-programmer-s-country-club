package library;

public class Library {

    private final Index index;
    private final Storage storage;
    private final ReservedMediaShelf reservedMediaShelf;

    public Library(Index index, Storage storage, ReservedMediaShelf reservedMediaShelf) {
        this.index = index;
        this.storage = storage;
        this.reservedMediaShelf = reservedMediaShelf;
    }

    public ReservationResult reserve(String bookTitle) {
        MediumIdentifier identifier = index.bookByTitle(bookTitle);
        try {
            Medium medium = storage.retrieveMedium(identifier);
            reservedMediaShelf.placeForPickUp(medium);
            return ReservationResult.successful(identifier, reservedMediaShelf);
        } catch (Exception exception) {
            return ReservationResult.failed(identifier, exception);
        }
    }
}