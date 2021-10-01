package com.schoolofnet.junit_maven;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class SuiteCaseTest2 {

    @Test
    public void sub() {
        assertThat(2 - 2, is(0));
    }

}
