package org.example.gradle.junit.xml.limitations;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FailingParameterizedTest {
    static Stream<String> parameters() {
        return Stream.of("firstParameter", "secondParameter");
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void firstMethod(String parameter) {
        fail("first method failing with parameter " + parameter);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void secondMethod(String parameter) {
        fail("second method failing with parameter " + parameter);
    }
}
