package com.vaznoe.hh.tests;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.vaznoe.hh.model.VariantModel;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest extends BaseTest {

    @Test(groups = "api")
    public void test() {
        Gson gson = new Gson();
        Response response = given().when().get(testProperty.getBaseUrl() + testProperty.getProductVariant())
                .then().statusCode(200).extract().response();
        VariantModel variantModel = gson.fromJson(response.body().prettyPrint(), VariantModel.class);
        assertThat(variantModel.getVariants().size()).isGreaterThanOrEqualTo(3);

        Response response1 = given().when().body(gson.toJson(variantModel)).post(testProperty.getBaseUrl() + testProperty.getProductOrder())
                .then().statusCode(200).extract().response();
        assertThat(response1.body().jsonPath().getString("status")).isEqualTo("Awesome!");
    }
}
