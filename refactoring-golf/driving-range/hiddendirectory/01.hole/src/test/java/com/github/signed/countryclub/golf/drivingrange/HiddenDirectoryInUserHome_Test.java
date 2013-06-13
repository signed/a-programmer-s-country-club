package com.github.signed.countryclub.golf.drivingrange;

import com.github.signed.junit.rule.SystemProperties;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HiddenDirectoryInUserHome_Test {

    @Rule
    public final SystemProperties systemProperties = new SystemProperties();

    @Test
    public void appendTheNameOfTheHiddenFolderToTheUserHome() throws Exception {
        systemProperties.put("user.home", "/the/users/home/directory");
        HiddenDirectoryInUserHome directory = new HiddenDirectoryInUserHome(".configuration");

        assertThat(directory.getBaseDirectory(), is(new File("/the/users/home/directory/.configuration")));
    }
}