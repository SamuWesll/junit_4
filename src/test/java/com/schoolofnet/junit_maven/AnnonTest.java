package com.schoolofnet.junit_maven;

import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class AnnonTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("@Before Class executed");
    }

    @Before
    public void beforeTest() {
        System.out.println("@Before annon executed");
    }

    @Test
    public void testOneTest() {
        System.out.println("@Teste One");
    }

    @Test
    @Ignore
    public void testOneTestIgnore() {
        System.out.println("@Teste One");
    }

    @Test(expected = Exception.class)
    @Ignore
    public void divideIntegerByZero() {
        int number = 10 / 0;
    }

    @Test
    public void createFolderRuleTest() {
        File folder = null;
        try {
            folder = this.folder.newFolder("My folder");
            Assert.assertTrue(folder.exists());
        } catch (IOException e) {
            Assert.assertTrue(folder.exists());
        }
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("@After Class executed");
    }
}
