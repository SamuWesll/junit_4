package com.schoolofnet.junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AnnonTest.class, AssertTest.class, StringUtilsTest.class
})
public class RunSuiteTest {
}
