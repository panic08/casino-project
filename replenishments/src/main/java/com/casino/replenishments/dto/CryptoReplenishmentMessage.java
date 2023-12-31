package com.casino.replenishments.dto;

import com.casino.replenishments.enums.CryptoReplenishmentSessionCurrency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CryptoReplenishmentMessage {
    private long userId;
    private String recipientAddress;
    private String recipientPrivateKey;
    private double amount;
    private CryptoReplenishmentSessionCurrency currency;
    private Data data;
    private long untilTimestamp;

    @Getter
    @Setter
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Data{
        @JsonProperty("ipaddress")
        private String ipAddress;
        private String browserName;
        private String browserVersion;
        private String operatingSystem;
    }
}
