package library;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private final Map<MediumIdentifier, Medium> media = new HashMap<MediumIdentifier, Medium>();


    public void addMedium(Medium medium, MediumIdentifier identifier) {
        media.put(identifier, medium);
    }

    public Medium retrieveMedium(MediumIdentifier identifier) {
        Medium medium = media.get(identifier);
        if(null == medium) {
            throw new RuntimeException("Medium is not in storage");
        }
        return medium;
    }
}
