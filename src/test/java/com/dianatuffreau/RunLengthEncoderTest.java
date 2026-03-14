package com.dianatuffreau;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunLengthEncoderTest {
    @Test
    @DisplayName("Standard compression: AAAABBBCC -> 4A3B2C")
    void testStandardCompression() {
        String input = "wwwwaaadexxxxxx";
        String expected = "w4a3d1e1x6";
        assertEquals(expected, RunLengthEncoder.encode(input), "The compression logic failed for a standard string.");
    }

    @Test
    @DisplayName("Single characters: ABC -> A1B1C1")
    void testSingleCharacters() {
        assertEquals("A1B1C1", RunLengthEncoder.encode("ABC"));
    }

    @Test
    @DisplayName("Empty string should return empty string")
    void testEmptyString() {
        assertEquals("", RunLengthEncoder.encode(""));
    }
}