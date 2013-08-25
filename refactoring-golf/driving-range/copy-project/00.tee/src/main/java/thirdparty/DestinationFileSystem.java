package thirdparty;

import java.io.File;

public interface DestinationFileSystem {

    void copyContentBelowToDestination(File sourceDirectory);

    void ensureAssociatedDirectoryExistsInDestination(File directory);
}
