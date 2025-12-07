package dev.usadamasa.lib;

import java.util.UUID;

public record SampleRecord(UUID payload) {
    public static SampleRecord of(UUID payload) {
        return new SampleRecord(payload);
    }
}
