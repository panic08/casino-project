package com.casino.withdrawals.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("com.casino.services.ip")
@Getter
@Setter
public class ServicesIpProperty {
    private String userApiIp;
}
