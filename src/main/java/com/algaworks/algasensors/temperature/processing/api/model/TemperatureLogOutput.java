package com.algaworks.algasensors.temperature.processing.api.model;

import io.hypersistence.tsid.TSID;

import java.time.OffsetTime;
import java.util.UUID;

public record TemperatureLogOutput(
        UUID id,
        TSID sensorId,
        OffsetTime registeredAt,
        Double value
) {
}
