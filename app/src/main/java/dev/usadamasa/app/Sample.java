package dev.usadamasa.app;

import dev.usadamasa.lib.SampleRecord;
import org.jspecify.annotations.NullMarked;

import java.util.UUID;

@NullMarked
public class Sample {
    public static SampleRecord getRecord(UUID uuid) {
        return SampleRecord.of(uuid);
    }

    public static SampleRecord getNullRecord() {
        return SampleRecord.ofNullable();
    }
}
