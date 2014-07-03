package library;

import java.util.ArrayList;
import java.util.List;

public class ReservedMediaShelf {

    private final String location;
    private final List<Medium> readyForPickUp = new ArrayList<Medium>();

    public ReservedMediaShelf(String location) {
        this.location = location;
    }

    public void placeForPickUp(Medium medium) {
        readyForPickUp.add(medium);
    }

    public String location() {
        return location;
    }
}
