package dev.usadamasa.app;

import dev.usadamasa.lib.SampleRecordFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SampleTest {

    @Test
    void getRecord() {
        var record = SampleRecordFixture.create();
        assertNotNull(record.payload());
    }
}
