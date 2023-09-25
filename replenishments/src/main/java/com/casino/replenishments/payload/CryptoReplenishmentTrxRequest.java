package com.casino.replenishments.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
public class CryptoReplenishmentTrxRequest {
    @Range(min = 11, message = "Minimum amount for TRX replenishment - 11 TRX")
    private double amount;

    @NotNull(message = "Data field is required")
    private Data data;

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data {
        @JsonProperty("ipaddress")
        private String ipAddress;
        private String browserName;
        private String browserVersion;
        private String operatingSystem;
    }
}
