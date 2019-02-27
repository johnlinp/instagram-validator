package io.github.johnlinp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class InstagramValidatorTest extends TestCase {
    public InstagramValidatorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(InstagramValidatorTest.class);
    }

    public void testInstagramHashtagValidation() {
        assertTrue(InstagramValidator.isValidHashtag("#hello"));
        assertTrue(InstagramValidator.isValidHashtag("#5566"));
        assertTrue(InstagramValidator.isValidHashtag("#sk8erboi"));
        assertTrue(InstagramValidator.isValidHashtag("#__init__"));
        assertTrue(InstagramValidator.isValidHashtag("#EricClapton"));

        assertFalse(InstagramValidator.isValidHashtag("xxx"));
        assertFalse(InstagramValidator.isValidHashtag("#hello.world"));
        assertFalse(InstagramValidator.isValidHashtag("#2+2=5"));
        assertFalse(InstagramValidator.isValidHashtag("#hello world"));
        assertFalse(InstagramValidator.isValidHashtag(" #hello"));
        assertFalse(InstagramValidator.isValidHashtag("#hello "));
        assertFalse(InstagramValidator.isValidHashtag("#coca-cola"));
        assertFalse(InstagramValidator.isValidHashtag("#why!?"));
        assertFalse(InstagramValidator.isValidHashtag("#said:what"));
    }
}
