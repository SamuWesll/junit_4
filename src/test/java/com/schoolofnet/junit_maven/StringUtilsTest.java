package com.schoolofnet.junit_maven;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
        String util = StringUtils.concatenate("SON", "jUnit");

        assertEquals("SONjUnit", util);
    }

}
