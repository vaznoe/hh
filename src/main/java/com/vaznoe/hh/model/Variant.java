package com.vaznoe.hh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Variant {

    private Integer id;
    @JsonProperty("product_id")
    private Integer productId;
    private String title;
    private String price;
    private String sku;
    private Integer position;
    @JsonProperty("inventory_policy")
    private String inventoryPolicy;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("inventory_management")
    private String inventoryManagement;
    private String option1;
    private String option2;
    private String option3;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    private Boolean taxable;
    private String barcode;
    private Integer grams;
    @JsonProperty("image_id")
    private Integer imageId;
    private Double weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("inventory_item_id")
    private Integer inventoryItemId;
    @JsonProperty("inventory_quantity")
    private Integer inventoryQuantity;
    @JsonProperty("old_inventory_quantity")
    private Integer oldInventoryQuantity;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("presentment_prices")
    private List<PresentmentPrice> presentmentPrices;
}
