package org.example.gradle.junit.xml.limitations;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class LimitationsTest {
    @Test
    void firstMethod() {
        fail("first method failing");
    }
}
