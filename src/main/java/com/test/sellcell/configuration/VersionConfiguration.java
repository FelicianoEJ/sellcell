package com.test.sellcell.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VersionConfiguration {
    @Value("${sellcell.app.apiversion}")
    private String version;

    public String getVersion() {
        return version;
    }
}
