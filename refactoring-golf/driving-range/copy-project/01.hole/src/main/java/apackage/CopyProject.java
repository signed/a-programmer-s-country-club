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
        destinationFileSystem.ensureAssociatedDirectoryExistsInDestination(baseDirectoryOf(project));
        copySourceRootOf(project);
        copyResourceRootOf(project);
    }

    private void copySourceRootOf(Project project) {
        File sourceRoot = new File(baseDirectoryOf(project), project.getSourceDirectory());
        destinationFileSystem.copyContentBelowToDestination(sourceRoot);
    }

    private void copyResourceRootOf(Project project) {
        File resourceRoot = new File(baseDirectoryOf(project), project.getResourceDirectory());
        destinationFileSystem.copyContentBelowToDestination(resourceRoot);
    }

    private File baseDirectoryOf(Project project) {
        return project.getBaseDirectory().getAbsoluteFile();
    }
}