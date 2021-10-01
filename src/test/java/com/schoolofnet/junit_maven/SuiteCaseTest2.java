package com.schoolofnet.junit_maven;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuiteCaseTest2 {

    @Test
    public void sub() {
        assertThat(2 - 2, is(0));
    }

    @Test
    public void mult() {
        assertThat(2 * 2, is(4));
    }


}
