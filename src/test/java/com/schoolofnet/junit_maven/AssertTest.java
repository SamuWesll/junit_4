package com.schoolofnet.junit_maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.schoolofnet.junit_maven.IsEmptyString.*;
import static com.schoolofnet.junit_maven.DisivibleBy.*;

public class AssertTest {

    @Test
    public void testAssert() {
        String str1 = "jUnit";
        String str2 = "jUnit";

//        assertEquals(str1, str2);
//
//        assertThat(str1, is("jUnit"));

        String tst = "";
        Integer tst2 = 4;

        assertThat(tst, is(isEmpty(tst)));
        assertThat(tst2, is(disivibleBy(2)));
    }

}
