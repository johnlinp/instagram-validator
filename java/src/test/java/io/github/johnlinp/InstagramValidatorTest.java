package io.github.johnlinp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InstagramValidatorTest {
    @Test
    public void testInstagramUsernameValidation() {
        assertTrue(InstagramValidator.isValidUsername("abc"));
        assertTrue(InstagramValidator.isValidUsername("a_bc"));
        assertTrue(InstagramValidator.isValidUsername("a.bc"));
        assertTrue(InstagramValidator.isValidUsername("a"));
        assertTrue(InstagramValidator.isValidUsername("abc123"));
        assertTrue(InstagramValidator.isValidUsername("_abc"));
        assertTrue(InstagramValidator.isValidUsername("abc_"));
        assertTrue(InstagramValidator.isValidUsername("abcabcabcabcabcabcabcabcabcabc"));
        assertTrue(InstagramValidator.isValidUsername("123.123"));

        assertFalse(InstagramValidator.isValidUsername(""));
        assertFalse(InstagramValidator.isValidUsername("123"));
        assertFalse(InstagramValidator.isValidUsername("abc."));
        assertFalse(InstagramValidator.isValidUsername(".abc"));
        assertFalse(InstagramValidator.isValidUsername("abcabcabcabcabcabcabcabcabcabca"));
        assertFalse(InstagramValidator.isValidUsername("abc+abc"));
        assertFalse(InstagramValidator.isValidUsername("abc,abc"));
        assertFalse(InstagramValidator.isValidUsername("abc-abc"));
        assertFalse(InstagramValidator.isValidUsername("abc/abc"));
    }

    @Test
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
