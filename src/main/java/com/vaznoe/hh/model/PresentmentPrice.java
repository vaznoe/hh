package com.vaznoe.hh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PresentmentPrice {

    private Price price;
    @JsonProperty("compare_at_price")
    private String compareAtPrice;
}
