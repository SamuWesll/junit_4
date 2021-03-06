package com.schoolofnet.junit_maven;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class DisivibleBy extends TypeSafeDiagnosingMatcher<Integer> {

    private final Integer number;

    public DisivibleBy(Integer number) {
        this.number = number;
    }

    @Override
    protected boolean matchesSafely(Integer number, Description description) {
        int result = number % 2;

        description.appendText("Number").appendValue(number).appendText("remain ").appendValue(result);

        return result == 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("The number is disivible por Two");
    }

    public static DisivibleBy disivibleBy(Integer number) {
        return new DisivibleBy(number);
    }
}
