package thirdparty;

import java.io.File;

public class Project {

    private final File baseDirectory;
    private final String sourceDirectory = "src";
    private final String resourceDirectory = "res";

    public Project(File baseDirectory){
        this.baseDirectory = baseDirectory;
    }

    public File getBaseDirectory(){
        return baseDirectory;
    }

    public String getSourceDirectory(){
        return sourceDirectory;
    }

    public String getResourceDirectory() {
        return resourceDirectory;
    }
}
