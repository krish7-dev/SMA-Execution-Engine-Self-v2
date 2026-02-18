package com.self.domain;

public record Tick(
        Instrument instrument,
        double price,
        long epochMillis
) {}
