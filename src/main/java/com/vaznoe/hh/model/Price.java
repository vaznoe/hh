package com.vaznoe.hh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Price {

    @JsonProperty("currency_code")
    private String currencyCode;
    private String amount;
}
