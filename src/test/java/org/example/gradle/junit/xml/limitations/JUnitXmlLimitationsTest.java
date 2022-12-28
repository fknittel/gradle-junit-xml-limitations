package org.example.gradle.junit.xml.limitations;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class JUnitXmlLimitationsTest {
    static Stream<String> parameters() {
        return Stream.of("firstParameter", "secondParameter");
    }

    @ParameterizedTest
    @MethodSource("parameters")
    @DisplayName("first method")
    void firstMethod(String parameter) {
        fail("first method failing with parameter " + parameter);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    @DisplayName("second method")
    void secondMethod(String parameter) {
        fail("second method failing with parameter " + parameter);
    }
}
