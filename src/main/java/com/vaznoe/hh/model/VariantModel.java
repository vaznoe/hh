package com.vaznoe.hh.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class VariantModel {

    private List<Variant> variants;
}
