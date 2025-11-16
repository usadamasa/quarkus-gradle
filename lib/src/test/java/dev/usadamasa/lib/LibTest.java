package dev.usadamasa.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibTest {
    @Test
    void getMessage() {
        Lib lib = new Lib();
        String message = lib.getMessage();
        assertEquals("Hello from Lib!", message);
    }
}
