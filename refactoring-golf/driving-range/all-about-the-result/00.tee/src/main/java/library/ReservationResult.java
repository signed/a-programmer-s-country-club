package library;

public class ReservationResult {

    public final String successMessage;
    public final String failedMessage;

    public ReservationResult(String successMessage, String failedMessage) {
        this.successMessage = successMessage;
        this.failedMessage = failedMessage;
    }

    public static ReservationResult failed(MediumIdentifier identifier, Exception exception) {
        return new ReservationResult(null, Messages.failedMessage(identifier, exception));
    }

    public static ReservationResult successful(MediumIdentifier identifier, ReservedMediaShelf reservedMediaShelf) {
        return new ReservationResult(Messages.successMessage(identifier, reservedMediaShelf), null);
    }

    public boolean wasSuccessful(){
        return null != successMessage;
    }
}
