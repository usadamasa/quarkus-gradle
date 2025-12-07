package dev.usadamasa.app;

import dev.usadamasa.lib.SampleRecord;

import java.util.UUID;

public class Sample {
    public static SampleRecord getRecord(UUID uuid) {
        return SampleRecord.of(uuid);
    }
}
