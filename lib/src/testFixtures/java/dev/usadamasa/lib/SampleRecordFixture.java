package dev.usadamasa.lib;

import java.util.UUID;

public class SampleRecordFixture {
    public static SampleRecord create() {
        return SampleRecord.of(UUID.randomUUID());
    }
}
