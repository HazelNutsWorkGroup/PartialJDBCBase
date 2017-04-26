package com.taiji.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Sleeb on 2017/4/25.
 */
@Component
@ConfigurationProperties(prefix = "RESTful.api")
public class RestfulConfiguration {

    private String baseUrl;
    private String version;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
