package dev.usadamasa.lib;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.util.UUID;

@NullMarked
public record SampleRecord(UUID payload) {
    public static SampleRecord of(UUID payload) {
        return new SampleRecord(payload);
    }

    @Nullable
    public static SampleRecord ofNullable() {
        return null;
    }
}
