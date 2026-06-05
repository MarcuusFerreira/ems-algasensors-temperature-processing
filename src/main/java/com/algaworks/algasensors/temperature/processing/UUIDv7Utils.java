package com.algaworks.algasensors.temperature.processing;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.UUID;

public class UUIDv7Utils {

    private UUIDv7Utils () {}

    public static OffsetDateTime extractOffSetDateTime(UUID uuid) {
        if (Objects.isNull(uuid)) {
            return null;
        }

        long timestamp = uuid.getMostSignificantBits() >>> 16;

        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }

}
