package library;

public class Messages {
    public static String successMessage(MediumIdentifier mediumIdentifier, ReservedMediaShelf shelf) {
        return String.format("You can pick up '%s' at the reserved media shelf at the %s", mediumIdentifier.title(), shelf.location());
    }

    public static String failedMessage(MediumIdentifier identifier, Exception exception) {
        return String.format("We are sorry, we could not reserve %s because %s", identifier.title(), exception.getMessage());
    }
}
