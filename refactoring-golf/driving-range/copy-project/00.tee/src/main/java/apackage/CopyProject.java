package apackage;

import thirdparty.DestinationFileSystem;
import thirdparty.Project;

import java.io.File;

public class CopyProject {

    private final DestinationFileSystem destinationFileSystem;

    public CopyProject(DestinationFileSystem destinationFileSystem){
        this.destinationFileSystem = destinationFileSystem;
    }

    public void copy(Project project){
        File baseDirectory = project.getBaseDirectory().getAbsoluteFile();
        destinationFileSystem.ensureAssociatedDirectoryExistsInDestination(baseDirectory);

        copySourceRoot(project, baseDirectory);
        copyResourceRoot(project, baseDirectory);
    }

    private void copySourceRoot(Project project, File baseDirectory) {
        File sourceRoot = new File(baseDirectory, project.getSourceDirectory());
        destinationFileSystem.copyContentBelowToDestination(sourceRoot);
    }

    private void copyResourceRoot(Project project, File baseDirectory) {
        File resourceRoot = new File(baseDirectory, project.getResourceDirectory());
        destinationFileSystem.copyContentBelowToDestination(resourceRoot);
    }
}