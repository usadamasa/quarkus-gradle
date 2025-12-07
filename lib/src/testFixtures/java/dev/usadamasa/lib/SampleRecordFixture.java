package dev.usadamasa.lib;

import org.jspecify.annotations.NullMarked;

import java.util.UUID;

@NullMarked
public class SampleRecordFixture {
    public static SampleRecord create() {
        return SampleRecord.of(UUID.randomUUID());
    }
}
