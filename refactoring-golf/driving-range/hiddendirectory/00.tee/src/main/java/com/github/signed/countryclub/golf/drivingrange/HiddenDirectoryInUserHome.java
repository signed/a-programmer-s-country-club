package com.github.signed.countryclub.golf.drivingrange;

import java.io.File;

public class HiddenDirectoryInUserHome {

    public File getBase() {
        File userHome = userHomeDirectory();
        return new File(userHome, ".configuration");
    }

    private File userHomeDirectory() {
        String path = System.getProperty("user.home");
        return new File(path);
    }
}
