package com.vaznoe.hh.config.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component @Getter
public class TestProperty {

    @Value("${base.url}")
    private String baseUrl;

    @Value("${google.url}")
    private String googleUrl;

    @Value("${hh.product.variant}")
    private String productVariant;

    @Value("${hh.product.order}")
    private String productOrder;
}
