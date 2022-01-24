package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {

    @Test
    void test01() {
        assertTrue(true);
    }

    @Test
    void test02() {
        assertTrue(true);
    }

    @Test
    void test03() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test04() {
        assertTrue(true);
    }
}
