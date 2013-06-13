package com.github.signed.countryclub.golf.drivingrange;

import java.io.File;

public class HiddenDirectoryInUserHome {

    private final String subdirectory;

    public HiddenDirectoryInUserHome(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    public File getBaseDirectory() {
        File userHome = userHomeDirectory();
        return new File(userHome, subdirectory);
    }

    private File userHomeDirectory() {
        String path = System.getProperty("user.home");
        return new File(path);
    }
}
